package com.example.test.controller;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// 用户登录控制器
@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public ModelAndView login(String name, String password){
        UserBean userBean = userService.loginIn(name,password);
        ModelAndView mav = null;
        if(userBean!=null){
            //Map<String,String> data = new HashMap<String,String>();
            String token = UUID.randomUUID().toString().toLowerCase();
            //data.put("token",token);
            mav = new ModelAndView("success");
            mav.addObject("time", new Date());
            mav.getModel().put("token",token);
            mav.getModel().put("name", "caoyc");
            return mav;
        }else {
            mav = new ModelAndView("error");
            return mav;
        }
    }



}
