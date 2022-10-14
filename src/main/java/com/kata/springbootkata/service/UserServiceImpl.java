package com.kata.springbootkata.service;

import com.kata.springbootkata.dao.UserDao;
import com.kata.springbootkata.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findById(Long id){
        return userDao.getOne(id);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    @Transactional
    public User saveUser(User user){
        return userDao.save(user);
    }

    @Transactional
    public void deleteById(Long id){
        userDao.deleteById(id);
    }
}
