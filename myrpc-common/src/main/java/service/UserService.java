package service;

import serializer.pojo.User;

/**
 * @author zhangzhidong
 * @since 2019/5/17
 */
public interface UserService {

    User findByName(String userName);

}
