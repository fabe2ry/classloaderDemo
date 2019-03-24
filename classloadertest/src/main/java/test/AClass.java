package test;

public class AClass {
    static {
        System.out.println("AClass init");
    }

    private BClass b;

    public AClass(){
        b = new BClass();
    }

    public void print(){
        System.out.println(this.getClass().getClassLoader().getClass().getName());
        System.out.println(b.getClass().getClassLoader().getClass().getName());
    }

}
