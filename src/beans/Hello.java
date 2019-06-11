package beans;

public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName2(String name) {
        System.out.println("setname: "+name);
        this.name = name;
    }
    public void hello(){
        System.out.println("Hello :"+name);
    }
    public Hello(){
        System.out.println("Hello构造器。。");
    }
}
