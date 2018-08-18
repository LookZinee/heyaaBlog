package cn.heyaa.heyaaBlog.controller;

import cn.heyaa.heyaaBlog.model.UserModel;
import cn.heyaa.heyaaBlog.service.LoginService;
import cn.heyaa.heyaaBlog.util.Res;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 登录逻辑controller
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private LoginService loginService;
    private final Log log = LogFactory.getLog(LoginController.class);

    @RequestMapping("/toLogin")
    public ModelAndView toLogin(HttpServletRequest req, ModelAndView view){
        log.info("---系统登录界面---");

        view.setViewName("/web/login/login.html");
        return view;
    }

    /**
     * 登录
     */
    @ResponseBody
    @RequestMapping("/login")
    public Res login(HttpServletRequest req, UserModel model){
        return loginService.login(model);
    }
}
