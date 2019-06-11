package aop;

public class TestAoPBasedPure {
    public static void main(String[] args) {
        Caculator caculator=new CaculatorImpl();
        Caculator proxy=new CalculatorLogProxy(caculator).getLogProxy();
        System.out.println(proxy.add(1,2));
        System.out.println(proxy.mul(2,3));
    }
}
