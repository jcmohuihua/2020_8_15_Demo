package com.gec.service;

import com.gec.domain.User;

import java.util.List;

/**
 * @author mhh
 * 2020/8/15 0015 - 下午 3:54
 */
public interface UserService {
    List<User> findAllUser();
}
