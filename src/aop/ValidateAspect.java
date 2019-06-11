package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)//使用order注解指定切面的优先级，值越小优先级越高
public class ValidateAspect {
    @Before("aop.LoggingAspect.declareJointPointExpress()")
    void BeforeVali(){
        System.out.println("这是检验功能的切面。。。");
    }
}
