package com.example.test;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/9/11
 * @Description: com.example.test
 * @Version: 1.0
 */
public class MessageUtil {
    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
