package com.example.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/9/10
 * @Description: com.example.test
 * @Version: 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        // 执行TestJunit里面所有的方法，并且返回失败的case
        // 执行runClasses方法里的所有的类里面的方法，这些方法必须是有@Test注解
        Result result = JUnitCore.runClasses(
                TestUnit1.class,
                TestUnit2.class,
                TestUnit3.class
        );
        int count = result.getRunCount();

        System.out.println("总的运行次数:"+count);
        System.out.println("失败次数:"+result.getFailureCount());
        System.out.println("忽略次数:"+result.getIgnoreCount());
        System.out.println("耗费时长(毫秒):"+result.getRunTime());
        for (Failure failure : result.getFailures()) {
            System.out.println("failure--->"+failure.toString());
        }
        System.out.println("result--->"+result.wasSuccessful());
    }
}
