package com.apnatriangle.relearnspringboot.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Satish", new Date()));
        users.add(new User(++usersCount, "Babu", new Date()));
        users.add(new User(++usersCount, "Adam", new Date()));
    }

    List<User> findAll() {
        return users;
    }

    User save(User user) {
        ++usersCount;
        user.setId(usersCount);
        users.add(user);
        return user;
    }

    User findOne(int id) {
        for(User user: users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }
}
