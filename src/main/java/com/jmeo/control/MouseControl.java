package com.jmeo.control;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by jmeo on 2016/5/31.
 */
public class MouseControl {

    public static void moveLeft(int v) {
        Point point = getMousePoint();
        ControlRobot.getInstance().mouseMove(point.x - v, point.y);
    }

    public static void moveRight(int v) {
        Point point = getMousePoint();
        ControlRobot.getInstance().mouseMove(point.x + v, point.y);
    }

    public static void moveUp(int v) {
        Point point = getMousePoint();
        ControlRobot.getInstance().mouseMove(point.x, point.y - v);
    }

    public static void moveDown(int v) {
        Point point = getMousePoint();
        ControlRobot.getInstance().mouseMove(point.x, point.y + v);
    }

    public static void moveToPoint(int x, int y) {
        ControlRobot.getInstance().mouseMove(x, y);
    }

    /**
     * 获取鼠标当前坐标
     *
     * @return
     */
    private static Point getMousePoint() {
        return MouseInfo.getPointerInfo().getLocation();
    }

    public static void leftClick() {
        ControlRobot.getInstance().mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public static void rightClick() {
        ControlRobot.getInstance().mouseRelease(InputEvent.BUTTON3_MASK);
    }

    public static void doubleClick() {
//        ControlRobot.getInstance().mouseRelease();
    }

    public static void click() {
//        ControlRobot.getInstance().keyRelease(MouseEvent.);
    }

}
