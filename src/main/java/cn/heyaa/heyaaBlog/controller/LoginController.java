package cn.heyaa.heyaaBlog.controller;

import cn.heyaa.heyaaBlog.model.UserModel;
import cn.heyaa.heyaaBlog.service.LoginService;
import cn.heyaa.heyaaBlog.service.UserService;
import cn.heyaa.heyaaBlog.util.Res;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 登录逻辑controller
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private LoginService loginService;
    @Resource
    private UserService  userService;

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

    @ResponseBody
    @RequestMapping("/getUsers")
    public void getUsers(){
        List<UserModel> list = userService.getAllUsers();
        System.out.println("查询到的用户一共有：" + list.size());
    }

}
