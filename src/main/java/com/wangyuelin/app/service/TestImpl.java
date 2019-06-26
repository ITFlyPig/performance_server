package com.wangyuelin.app.service;

import com.wangyuelin.app.bean.User;
import com.wangyuelin.app.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestImpl {

    private UserDao userDao;

    public User getUser() {
        User user = userDao.getUserById(2);
        return user;
    }

    public List<User> getAll() {
        return userDao.selectAll();
    }
}
