package com.jmeo.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by jmeo on 2016/5/31.
 */
public class Config {

    private static Properties properties;
    String dir = System.getProperty("user.dir");
//    String configPath = dir+"/conf/config.properties";

    public static String getDirPath(){
        return System.getProperty("user.dir");
    }

    public static String getConfPath(String file){
        return getDirPath()+"/conf/"+file;
    }

    public static String getConfigPath(){
        return getDirPath()+"/conf/config.properties";
    }

    public static Properties getConfig(String path){
        if(properties == null){
            properties = new Properties();
            try {
                properties.load(new FileInputStream(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public static Properties getProperties(String path){
        Properties ps = new Properties();
        try {
            ps.load(new FileInputStream(path));
        }catch (Exception e){
            e.printStackTrace();
        }
        return ps;
    }

    public static void setProperties(String key,Object value){
        if(properties == null){
            properties = getConfig(getConfigPath());
        }
        properties.setProperty(key,String.valueOf(value));
        try {
            properties.store(new FileOutputStream(getConfigPath()),"update "+key + "=" + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return getConfig(getConfigPath()).getProperty(key);
    }

}
