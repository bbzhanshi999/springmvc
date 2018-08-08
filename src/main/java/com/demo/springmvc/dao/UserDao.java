package com.demo.springmvc.dao;

import com.demo.springmvc.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {


    User getUser(Long id);
}
