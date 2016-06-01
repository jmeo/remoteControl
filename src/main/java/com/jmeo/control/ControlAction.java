package com.jmeo.control;

import com.jmeo.config.Config;

/**
 * Created by jmeo on 2016/6/1.
 */
public class ControlAction {


    /**
     * 移动操作
     *
     * @param action
     */
    public static void MoveAction(String action) {
        int interval = Integer.valueOf(Config.getProperty("interval"));
//        switch (action) {
//            case "MOVE_LEFT":
//                MouseControl.moveLeft(interval);
//            case "MOVE_RIGHT":
//                MouseControl.moveRight(interval);
//            case "MOVE_UP":
//                MouseControl.moveUp(interval);
//            case "MOVE_DOWN":
//                MouseControl.moveDown(interval);
//            case "CLICK_LEFT":
//                MouseControl.leftClick();
//            case "CLICK_RIGHT":
//                MouseControl.rightClick();
//            case "CLICK_DOUBLE":
//                MouseControl.doubleClick();
//            default:
//                ;
//        }

        if ("MOVE_LEFT".equals(action)) {
            MouseControl.moveLeft(interval);
        }
        if ("MOVE_RIGHT".equals(action)) {
            MouseControl.moveRight(interval);
        }
        if ("MOVE_UP".equals(action)) {
            MouseControl.moveUp(interval);
        }
        if ("MOVE_DOWN".equals(action)) {
            MouseControl.moveDown(interval);
        }
        if ("CLICK_LEFT".equals(action)) {
            MouseControl.leftClick();
        }
        if ("CLICK_RIGHT".equals(action)) {
            MouseControl.rightClick();
        }
        if ("CLICK_DOUBLE".equals(action)) {
            MouseControl.doubleClick();
        }
    }

    public static void Analysis(String info){
        String [] act = Analysis.getActions(info);
        for(String k:act){
            MoveAction(k);
        }
    }



}
