package factoryBean;

import org.springframework.beans.factory.FactoryBean;
//要实现FactoryBean这个接口
public class CarFactoryBean implements FactoryBean<Car> {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //    返回bean的对象
    @Override
    public Car getObject() throws Exception {
        return new Car(brand,500000);
    }

    //    返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    //是否为单实例的
    @Override
    public boolean isSingleton() {
        return true;
    }
}
