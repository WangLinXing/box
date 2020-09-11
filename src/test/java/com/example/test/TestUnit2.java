package com.example.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/9/11
 * @Description: com.example.test
 * @Version: 1.0
 */
public class TestUnit2 {

    @BeforeClass
    public static void before(){
        System.out.println("TestUnit2.class 初始化操作\n");
    }

    @AfterClass
    public static void after(){
        System.out.println("TestUnit2.class 清理操作\n");
    }

    @Test
    public void test1(){
        System.out.println("start call test1()");
        String str= "Junit is working fine";
        int x = 18;
        assertEquals(18,x);
    }
}
