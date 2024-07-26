package com.atguigu.schedule.test;

import com.atguigu.schedule.util.MD5Util;
import org.junit.Test;

public class Tj {
    @Test
    public void jia(){
        String encrypt = MD5Util.encrypt("1234567");
        System.out.println(encrypt);
    }
}
