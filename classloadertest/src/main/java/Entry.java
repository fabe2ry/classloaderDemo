import java.lang.reflect.Method;

public class Entry {
    public static void main(String[] args) throws Exception{
        MyClassLoader secondClassLoader = new MyClassLoader();
        Class aClazz = Class.forName("test.AClass", true, secondClassLoader);
        System.out.println("!!!!");
        Object a = aClazz.newInstance();
        System.out.println("!!!!");
        Method printMethod = aClazz.getMethod("print");
        printMethod.invoke(a);
    }
}
