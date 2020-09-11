package com.example.test;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/9/10
 * @Description: com.example.test
 * @Version: 1.0
 */
public class TestUnit1{

    @BeforeClass
    public static void before(){
        System.out.println("TestUnit1.class 初始化操作\n");
    }

    @AfterClass
    public static void after(){
        System.out.println("TestUnit1.class 清理操作\n");
    }

    @Before
    public void beforeOption(){
        System.out.println("测试方法前执行-->");
    }

    @After
    public void afterOption(){
        System.out.println("测试方法后执行==>\n");
    }

    @Test
    public void testAdd() {
        System.out.println("start call testAdd()");
        String str= "Junit is working fine";
        assertEquals("Junit is working fine1",str);
    }

    @Test
    public void testInt() {
        System.out.println("start call testInt()");
        int x = 1;
        assertEquals(2,x);
    }

    @Test
    public void testString() {
        System.out.println("start call testString()");
        String  x = "IDEA javas";
        assertEquals("IDEA javas",x);
    }

    @Test
    public void testAssertions() {
        System.out.println("start call testAssertions()");
        //test data
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";
        int val1 = 5;
        int val2 = 6;
        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};
        //Check that two objects are equal
        assertEquals(str1, str2);
    }

    @Test
    public void testArray(){
        System.out.println("start call testArray()");
        int[] x = {1,2,3,4};
        int[] y = {1,2,3,4};
        assertArrayEquals(y,x);
    }
}
