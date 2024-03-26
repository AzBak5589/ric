package com.sgric.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgric.backend.model.AuthUser;
import com.sgric.backend.model.ReponseModel;
import com.sgric.backend.model.User;
import com.sgric.backend.services.UserServices;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/users")
    private ReponseModel getall() {
        List<User> res = new ArrayList<>();
        try {
            res = userServices.getall();
        } catch (Exception e) {
            return new ReponseModel(false, null, e.getMessage());
        }
        return new ReponseModel(true, res, null);
    }

    @PostMapping("/user")
    private ReponseModel savUser(@RequestBody User user) {
        User res = null;
        try {
            res = userServices.save(user);
        } catch (Exception e) {
            return new ReponseModel(false, null, e.getMessage());
        }
        return new ReponseModel(true, res, null);
    }

    @PostMapping("/loginuser")
    private ReponseModel loginUser(@RequestBody AuthUser user) {
        User res = null;
        try {
            res = userServices.loginUser(user);
        } catch (Exception e) {
            return new ReponseModel(false, null, e.getMessage());
        }
        if (res != null)
            return new ReponseModel(true, res, null);
        else
            return new ReponseModel(false, null, "Aucun utilisateur trouvé !");
    }
}
