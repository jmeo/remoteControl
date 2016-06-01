package com.jmeo.config;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

/**
 * Created by jmeo on 2016/6/1.
 */
public class ControlSet {
    private static boolean isInit = false;
    private static Properties setting;
    static {
        setting = Config.getProperties(Config.getConfPath("setting.properties"));
    }

    private static HashMap<String,String> controlSet = new HashMap<String, String>();
    private static HashMap<String,String> valueSet = new HashMap<String, String>();
    private static HashSet<String> actionSet = new HashSet<String>();

    public static void initSet(){
        if(!isInit){
            Enumeration e = setting.propertyNames();
            while(e.hasMoreElements()){
                Object c = e.nextElement();
                actionSet.add(String.valueOf(c));
            }
            for(String key:actionSet){
                controlSet.put(key,setting.getProperty(key));
                valueSet.put(setting.getProperty(key),key);
            }
            isInit = true;
        }
    }

    public static String getAction(String v){
        initSet();
        return valueSet.get(v);
    }

    public static String getValue(String k){
        initSet();
        return controlSet.get(k);
    }

}
