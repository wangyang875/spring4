package InstanceFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstanceFactory {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car= (Car) context.getBean("car1");
        System.out.println(car.toString());
    }
}
