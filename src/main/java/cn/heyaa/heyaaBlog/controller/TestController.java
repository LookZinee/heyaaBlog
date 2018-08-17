package cn.heyaa.heyaaBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: ziyi.liu
 * @Date: 2018/8/16 17:07
 * @Version 1.0
 */
@Controller
@RequestMapping("/")
public class TestController {

    @ResponseBody
    @RequestMapping("/")
    public String login(){
        return "kansha gun a";
    }

    @RequestMapping("/tologin")
    public ModelAndView login(HttpServletRequest req, ModelAndView view){
        System.out.println("进入主页");
        view.setViewName("/web/index.html");
        return view;
    }
}
