package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    //fake User List

    List<User> list = List.of(
            new User(1311L, "Vishu", "1234"),
            new User(1312L, "Shishu", "5678"),
            new User(1314L, "Rishu", "9012")

    );

    @Override
    public User getUser(Long userId) {
        return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);

        // when the URI userId equals any of the (fake) user list userId, then get that particular userId Values
    }
}
