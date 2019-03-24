package api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public class AngleManager {


    private static int angleIndex = 0;
    private static List<Angle> angles = new ArrayList<Angle>();

    /**
     * 提供注册功能
     * @param angle
     */
    public static void registerAngle(Angle angle){
        angles.add(angle);
    }

    /**
     * 获取一个接口实现
     * @return
     */
    public static Angle angleFall(){
        if(angles.size() > 0 && angleIndex < angles.size()){
            return angles.get(angleIndex ++);
        }
        return null;
    }

    /**
     * 提供初始化操作，里面使用spi，来发现第三方的接口实现
     */
    private static void angleManagerInit() {
        ServiceLoader<Angle> angleServiceLoader = ServiceLoader.load(Angle.class);
        Iterator<Angle> angleIterator = angleServiceLoader.iterator();
        while(angleIterator.hasNext()) {
//            这里会调用Class.forName(name, init, classloader);
            angleIterator.next();
        }
    }

    static {
        System.out.println("angleManagerInit");
        angleManagerInit();
    }


}
