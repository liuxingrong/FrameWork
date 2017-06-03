package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.User;
import com.team.mapper.UserMapper;
import com.team.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class UserServiceImpl implements UserService{

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        try {
            userMapper.insertSelective(user);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            userMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(User user) {
        try {
            userMapper.updateByPrimaryKeySelective(user);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return userMapper.selectAll();
    }

    public User findByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
