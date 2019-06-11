package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutowired {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-auto.xml");
        Person person= (Person) context.getBean("person");
        System.out.println(person.toString());
    }
}
