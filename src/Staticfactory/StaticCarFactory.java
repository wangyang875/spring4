package Staticfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：
 * 直接调用一个静态方法就可以返回bean的实例(这里是由getCar这个静态方法来配置Car的实例)
 */
public class StaticCarFactory {
    private static Map<String ,Car> carMap=new HashMap<String, Car>();
    static {
        carMap.put("audi",new Car("audi",200000));
        carMap.put("ford",new Car("ford",300000));
    }
    //静态方法
    public static Car getCar(String name ){
        return carMap.get(name);
    }
}
