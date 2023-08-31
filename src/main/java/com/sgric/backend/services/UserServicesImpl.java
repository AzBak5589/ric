package com.sgric.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgric.backend.model.AuthUser;
import com.sgric.backend.model.User;
import com.sgric.backend.repositoire.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User save(User user) {
        User res = null;
        try {
            res = userRepo.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<User> getall() {
        List<User> res = null;
        try {
            res = userRepo.findAll();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return res;
    }

    @Override
    public User loginUser(AuthUser user) {
        User u = null;
        try {
            u = userRepo.getUserByLoginAndPwd(user.getLogin(), user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

}
