package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorLogProxy {
    //    要代理的对象
    private Caculator target;

    public CalculatorLogProxy(Caculator target) {
        this.target = target;
    }

    public Caculator getLogProxy() {
        Caculator proxy = null;
//        代理对象由哪一个类加载器负责加载
        ClassLoader loader = target.getClass().getClassLoader();
//        代理对象的类型，即其中有哪些方法
        Class[] interfaces = new Class[]{Caculator.class};
//        当调用代理对象其中的方法时，该执行的代码
        InvocationHandler handler = new InvocationHandler() {
            /**
             *
             * @param proxy 正在返回的代理对象，一般在invoke方法中都不使用这个对象
             * @param method 正在调用的方法
             * @param args  调用方法时传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
//                日志
                System.out.println("logging-->方法" + methodName + "在被调用。。。" + "参数为" + Arrays.asList(args));
//                执行方法
                Object result = method.invoke(target, args);
//                日志
                System.out.println("logging-->方法" + methodName + "返回" + result.toString());
                return result;
            }
        };
        proxy = (Caculator) Proxy.newProxyInstance(loader, interfaces, handler);
        return proxy;
    }
}
