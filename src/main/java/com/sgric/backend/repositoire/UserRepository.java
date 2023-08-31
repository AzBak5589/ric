package com.sgric.backend.repositoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgric.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.login=:login and u.password=:password")
    User getUserByLoginAndPwd(String login, String password);

}
