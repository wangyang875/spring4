package AnnotationBasedBean.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "repository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository save....");
    }
}
