package com.jmeo.control;

import com.jmeo.config.ControlSet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jmeo on 2016/5/31.
 * 解析信号
 */
public class Analysis {

    /**
     * 校验code
     * @param code
     */
    public static boolean verifyCode(String code){
        Pattern pattern = Pattern.compile("^0x\\d{0,3}$");
        Matcher matcher = pattern.matcher(code);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    /**
     * 拆分信号 以空格分开
     * @param info
     * @return
     */
    public static String[] getInfos(String info){
        return info.split(" ");
    }

    public static String getAction(String info){
        if(verifyCode(info)){
            return ControlSet.getAction(info);
        }else {
            return null;
        }
    }

    public static String [] getActions(String info){
        String [] vs = getInfos(info);
        String [] acts = new String[vs.length];
        for(int i=0;i<vs.length;i++){
            acts[i] = getAction(vs[i]);
        }
        return acts;
    }

}
