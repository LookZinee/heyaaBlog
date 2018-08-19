package cn.heyaa.heyaaBlog.common;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.List;

public class BaseDao extends SqlSessionDaoSupport {

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public List  getList(String method,Object param){
        return this.getSqlSession().selectList(method,param);
    }

    public List getList(String method){
        return this.getSqlSession().selectList(method);
    }
}
