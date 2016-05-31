package com.jmeo.control;

import java.awt.*;

/**
 * Created by jmeo on 2016/5/31.
 */
public class ControlRobot {

    private static Robot robot;

    public static Robot getInstance(){
        if(robot == null){
            try {
                robot = new Robot();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return robot;
    }

}
