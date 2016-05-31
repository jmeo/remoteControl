package com.jmeo.control;

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





}
