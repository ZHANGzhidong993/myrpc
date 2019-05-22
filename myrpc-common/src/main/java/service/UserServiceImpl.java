package service;

import org.springframework.stereotype.Service;
import serializer.pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhangzhidong
 * @since 2019/5/17
 */
public class UserServiceImpl implements UserService {

    private static final Map<String, User> USER_MAP = new HashMap<>();

    static {
        USER_MAP.put("zzd", new User("zzd", "zzd@163.com"));
        USER_MAP.put("hhh", new User("hhh", "hhh@163.com"));
    }

    @Override
    public User findByName(String userName) {
        return USER_MAP.get(userName);
    }

}
