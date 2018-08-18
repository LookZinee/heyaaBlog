package cn.heyaa.heyaaBlog.service;

import cn.heyaa.heyaaBlog.model.UserModel;
import cn.heyaa.heyaaBlog.util.Res;

public interface LoginService {
    Res login(UserModel model);
}
