package org.spring.framework.sample.service.impl;

import org.spring.framework.annottation.Service;
import org.spring.framework.annottation.Transaction;
import org.spring.framework.helper.DBHelper;
import org.spring.framework.sample.entity.User;
import org.spring.framework.sample.service.UserService;

import java.util.UUID;

/**
 * @author jiangyixuan
 * @date 2018-03-06
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {

        User user = new User();
        user.setName("jiangyixuan");
        user.setAge(24);

        return user;
    }

    @Override
    @Transaction
    public Integer insertUser() {

        Integer rows = -1;
//        try {
//            //开启事务
//            DBHelper.beginTransaction();
//            String sql = "INSERT INTO `user` VALUES (?, ?, ?);";
//            Object[] params = {UUID.randomUUID().toString(), "2", 2};
//
//            rows = DBHelper.update(sql, params);
//
//            throw new Exception("插入数据库后出现异常，测试是否回滚");
//
//        } catch (Exception e) {
//            // 回滚事务
//            DBHelper.rollbackTransaction();
//            e.printStackTrace();
//
//        } finally {
//            //提交事务
//            DBHelper.commitTransaction();
//        }

        String sql = "INSERT INTO `user` VALUES (?, ?, ?);";
        Object[] params = {UUID.randomUUID().toString(), "2", 2};
        rows = DBHelper.update(sql, params);

        int i = 1 / 0;

        return rows;
    }
}
