package com.example.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/9/11
 * @Description: com.example.test
 * @Version: 1.0
 */
public class TestUnit3 {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "New Word";
        assertEquals(message,messageUtil.printMessage());
    }
}
