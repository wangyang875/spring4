package factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanFactory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-beanFactory.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car.toString());
    }
}
