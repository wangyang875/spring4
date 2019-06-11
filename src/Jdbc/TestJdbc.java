package Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    private ApplicationContext context=null;
    {
        context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
    }
}
