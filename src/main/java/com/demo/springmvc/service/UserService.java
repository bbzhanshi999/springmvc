package com.demo.springmvc.service;

import com.demo.springmvc.dao.UserDao;
import com.demo.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Long id) {

        return userDao.getUser(id);
    }
}
