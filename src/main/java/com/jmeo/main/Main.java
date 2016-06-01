package com.jmeo.main;

import com.jmeo.config.Config;
import com.jmeo.config.ControlSet;
import com.jmeo.control.Analysis;
import com.jmeo.control.MouseControl;
import com.jmeo.socket.SocketServer;

import java.util.Properties;

/**
 * Created by jmeo on 2016/5/31.
 */
public class Main {

    public static void  main(String [] args){
//        MouseControl.rightClick();
//        System.out.println(System.getProperty("user.dir"));
//        Config.setProperties("kdkd","ddd");
//        Properties p = Config.getConfig();
//        System.out.println(Config.getConfig().getProperty("port"));
        //socket 服务
        SocketServer.start();

//        System.out.println(Analysis.verifyCode("0x0001"));

//        ControlSet.initSet();
    }
}
