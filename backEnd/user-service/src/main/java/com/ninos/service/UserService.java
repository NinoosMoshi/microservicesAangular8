package com.ninos.service;

import com.ninos.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> idList);

}
