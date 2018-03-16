package org.spring.framework.sample.service;


import org.spring.framework.sample.entity.User;

/**
 * @author jiangyixuan
 * @date 2018-03-06
 */
public interface UserService {

    User getUser();

    Integer insertUser();

}
