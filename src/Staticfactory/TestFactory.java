package Staticfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car= (Car) context.getBean("car");
        System.out.println(car.toString());
    }
}
