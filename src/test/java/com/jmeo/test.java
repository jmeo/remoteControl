package com.jmeo;

import com.jmeo.control.Analysis;
import org.junit.Test;

/**
 * Created by jmeo on 2016/5/31.
 */
public class test {

    /**
     * 信号规则校验
     */
    @Test
    public void verifyCodeTest(){
        String code1 = "0x001";
        String code2 = "0d001";

        assert Analysis.verifyCode(code2);
    }



}
