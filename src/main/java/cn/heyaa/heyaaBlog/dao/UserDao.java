package cn.heyaa.heyaaBlog.dao;

import cn.heyaa.heyaaBlog.model.UserModel;

import java.util.List;

public interface UserDao {
    List<UserModel> getAllUsers();
}
