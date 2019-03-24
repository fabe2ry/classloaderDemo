package hell;

import api.Angle;
import api.AngleManager;

public class Lucifer implements Angle {
    static {
        System.out.println("i am lucifer, i init");
        AngleManager.registerAngle(new Lucifer());
    }

    public void love(String s) {
        System.out.println("Lucifer love single dog");
    }

    public void hate(String s) {
        System.out.println("Lucifer hate couple dog");
    }
}
