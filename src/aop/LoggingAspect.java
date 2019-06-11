package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

/**
 * 日志切面,把这个类声明为一个切面，需要把该类加入到ioc容器中，在声明为一个切面
 */
@Aspect
@Component
public class LoggingAspect {
    /**
     * 自己定义一个方法来声明切入点的表达式，方便后面进行重用,别的类也可以引用
     */
    @Pointcut("execution(* aop.CaculatorImpl.*(..))")
    public void declareJointPointExpress(){

    }
//    前置通知
    @Before("declareJointPointExpress()")
    void beforeMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        List<Object> args= Arrays.asList(joinPoint.getArgs());
        System.out.println("the method "+methodName+" begins with args:"+args.toString());
    }
//    后置通知，无论要切入的方法是否出现异常，结束后都会执行
    @After("execution(* aop.CaculatorImpl.*(..))")
    void afterMethod(){
        System.out.println("the method  ends...");
    }

    /**
     * 返回通知，方法正常返回之后才会执行，并且可以访问到方法的返回值
     */
    @AfterReturning(value = "execution(* aop.CaculatorImpl.*(..))",returning = "result")
    void afterReturning(JoinPoint joinPoint,Object result){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the method "+methodName+" ends normally with result : "+ result);
    }

    /**
     * 异常通知，在方法出现异常时执行，并且可以指定出现特定异常才执行通知，比如NullPointerException
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value = "execution(* aop.CaculatorImpl.*(..))",throwing = "ex")
    void afterThrowing(JoinPoint joinPoint,Exception ex){
        String methodName =joinPoint.getSignature().getName();
        System.out.println("the method "+methodName+" throws exception : "+ ex);
    }

    /**
     * 环绕通知需要携带ProceedingJoinPoint类型的参数，类似于动态代理的全过程
     * ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
     * 且环绕通知必须有返回值，且为目标方法的返回值
     * @param point
     */
    @Around("execution(* aop.CaculatorImpl.*(..))")
    Object aroundMethod(ProceedingJoinPoint point){
        Object result=null;
        String methodName=point.getSignature().getName();
        List<Object> args=Arrays.asList(point.getArgs());
//        执行目标方法
        try {
//            前置通知
            System.out.println("the method "+methodName+" begins with args:"+args.toString());
            point.proceed();
//            后置通知
            System.out.println("the method  ends...");
        } catch (Throwable throwable) {
//            异常通知
            System.out.println("the method "+methodName+" throws exception : "+ throwable);
        }
       return 100;
    }
}
