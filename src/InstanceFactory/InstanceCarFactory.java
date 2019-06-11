package InstanceFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：需要创建工厂本身，
 */
public class InstanceCarFactory {
    private static Map<String,Car> carMap=null;
    static {
        carMap=new HashMap<String,Car>();
        carMap.put("audi",new Car("audi",200000));
        carMap.put("ford",new Car("ford",300000));
    }
//    实例方法
    public  Car getCar(String name ){
        return carMap.get(name);
    }
}
