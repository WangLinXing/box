package com.example.test;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import junit.framework.*;
import static junit.framework.TestCase.assertEquals;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
//    public void contextLoads() {
    public void t1() {
        UserBean userBean = userService.loginIn("admin","123456");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

    @Test
    public void addUser() {
        UserBean userBean = new UserBean();
        userBean.setName("landa");
        userBean.setPassword("23$5_.A");
        userService.addUser(userBean);
    }

    @Test
    public void testAdd() {
        String str= "Junit is working fine";
        assertEquals("Junit is working fine1",str);

        String str1= "Junit";
        assertEquals("Junit",str1);
    }

    @Test
    public void test2() {
        String str1= "Junit";
        assertEquals("Junit",str1);
    }

}
