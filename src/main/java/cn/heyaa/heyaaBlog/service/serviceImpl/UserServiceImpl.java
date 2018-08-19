package cn.heyaa.heyaaBlog.service.serviceImpl;

import cn.heyaa.heyaaBlog.dao.UserDao;
import cn.heyaa.heyaaBlog.model.UserModel;
import cn.heyaa.heyaaBlog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List<UserModel> getAllUsers() {
        return userDao.getAllUsers();
    }
}
