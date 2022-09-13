package com.bjpowernode.controller;

import com.bjpowernode.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/tpl")
public class HelloController {

    @GetMapping("/hello")
    public String helloThymeleaf(HttpServletRequest request){
        request.setAttribute("data","欢迎使用Thymeleaf模板引擎");
        return "hello";
    }

    @GetMapping("/expression1")
    public String expression1(Model model){
        model.addAttribute("site","www.bjpowernode.com");
        model.addAttribute("myuser",new User(1001,"lisi","男",23));
        return "expression1";
    }

    @GetMapping("/expression2")
    public String expression2(Model model){
        model.addAttribute("site","www.bjpowernode.com");
        model.addAttribute("myuser",new User(1001,"lisi","男",23));
        return "expression2";
    }

    //链接表达式
    @GetMapping("/link")
    public String link(Model model){
        model.addAttribute("userId",1002);
        return "link";
    }

    //测试连接表达式的地址
    @GetMapping("/queryAccount")
    @ResponseBody
    public String queryAccount(Integer id){
        return "queryAccount,参数id=" + id;
    }


}
