package com.nowcoder.service;

import com.nowcoder.dao.UserDao;
import com.nowcoder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 546 on 2017/5/15.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUser(int id){
        return userDao.selectById(id);
    }
}
