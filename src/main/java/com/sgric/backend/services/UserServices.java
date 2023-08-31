package com.sgric.backend.services;

import com.sgric.backend.model.AuthUser;
import com.sgric.backend.model.User;
import java.util.List;

public interface UserServices {
    User save(User user);

    List<User> getall();

    User loginUser(AuthUser user);
}
