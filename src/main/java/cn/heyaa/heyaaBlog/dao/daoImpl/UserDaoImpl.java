package cn.heyaa.heyaaBlog.dao.daoImpl;

import cn.heyaa.heyaaBlog.common.BaseDao;
import cn.heyaa.heyaaBlog.dao.UserDao;
import cn.heyaa.heyaaBlog.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao{

    @Override
    public List<UserModel> getAllUsers() {
        List<UserModel> list = this.getList("cn.heyaa.heyaaBlog.model.UserModelMapper.getAllUsers");
        return list;
    }
}
