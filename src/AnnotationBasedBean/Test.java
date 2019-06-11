package AnnotationBasedBean;

import AnnotationBasedBean.controller.UserController;
import AnnotationBasedBean.repository.UserRepositoryImpl;
import AnnotationBasedBean.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans-annotation.xml");
//        TestObject object= (TestObject) context.getBean("testObject");
//        System.out.println(object);
        UserController userController= (UserController) context.getBean("userController");
        System.out.println(userController);
        userController.execute();
//        UserService userService= (UserService) context.getBean("userService");
//        System.out.println(userService);
//        UserRepositoryImpl repository= (UserRepositoryImpl) context.getBean("repository");
//        System.out.println(repository);
    }
}
