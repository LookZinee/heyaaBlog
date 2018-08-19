package cn.heyaa.heyaaBlog.service.serviceImpl;

import cn.heyaa.heyaaBlog.model.UserModel;
import cn.heyaa.heyaaBlog.service.LoginService;
import cn.heyaa.heyaaBlog.util.Res;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public Res login(UserModel model) {
        //TODO 1.校验账号密码是否为空
        //TODO 2.校验账号密码是否正确
        return Res.suc();
    }
}
