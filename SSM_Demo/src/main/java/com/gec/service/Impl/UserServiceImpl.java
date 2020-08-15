package com.gec.service.Impl;

import com.gec.dao.UserMapper;
import com.gec.domain.User;
import com.gec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mhh
 * 2020/8/15 0015 - 下午 3:55
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper um;

    @Override
    public List<User> findAllUser() {
        return um.selectByExample(null);
    }
}
