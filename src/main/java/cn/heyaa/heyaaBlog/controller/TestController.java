package cn.heyaa.heyaaBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: ziyi.liu
 * @Date: 2018/8/16 17:07
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/login")
    public String login(){
        return "hello world";
    }
}
