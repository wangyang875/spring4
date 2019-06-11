package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopBasedAspectJ {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-aop.xml");
        Caculator caculator= (Caculator) context.getBean("caculatorImpl");
        /**
         * Spring AOP实现方式有两种，一种使用JDK动态代理，另一种通过CGLIB来为目标对象创建代理。
         * 如果被代理的目标实现了至少一个接口，则会使用JDK动态代理，所有该目标类型实现的接口都将被代理。
         * 若该目标对象没有实现任何接口，则创建一个CGLIB代理，创建的代理类是目标类的子类
         * 这里实现了一个接口，所以该是通过JDK动态代理来实现AOP的
         */
        int result=caculator.add(2,3);
        int result1=caculator.div(12,0);
        System.out.println(result+" "+result1);
    }
}
