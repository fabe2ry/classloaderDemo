package impl;

import api.Angle;
import api.AngleManager;

public class FireAngle implements Angle {

    static {
//        自己的初始化
        System.out.println("i am fire angle, i init");
        AngleManager.registerAngle(new FireAngle());
    }

    public FireAngle(){

    }

    public void love(String singleDog) {
        System.out.println("single dog is happy, very very happy");
    }

    public void hate(String coupleDog) {
        System.out.println("Burning coupleDog");
    }
}
