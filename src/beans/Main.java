package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String args[] ){
    /*
    创建对象和为对象属性赋值可以由spring来做

    Hello hello=new Hello();
    hello.setName2("hahahh");
    */


//    1.创建spring的IOC容器对象,这时，sprig-config里面的bean都构造好了，包括构造方法和set方法等,ClassPathXmlApplicationContext是Applicationcontext的实现类
    ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
//    2.从IOC容器中获取bean实例
//              通过id获取bean
//    Hello hello= (Hello) context.getBean("hello");
//                通过类名获取，但可能不唯一
//    Hello hello=context.getBean(Hello.class);
//    hello.hello();
    Car car= (Car) context.getBean("car1");
    System.out.println(car.toString());
    Person person= (Person) context.getBean("person");
    System.out.println(person.toString());
}
}
