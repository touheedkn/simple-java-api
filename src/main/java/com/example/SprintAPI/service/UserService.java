package com.example.SprintAPI.service;

import com.example.SprintAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1, "John", 28, "john@gmail.com");
        User user2 = new User(2, "Jane", 26, "jane@gmail.com");
        User user3 = new User(3, "Zane", 46, "jane@gmail.com");
        User user4 = new User(4, "Zoe", 16, "jane@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }
    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for(User user:userList){
            if(id.equals(user.getId())){
                optional = Optional.of(user);
                break;
            }
        }
        return Optional.ofNullable(optional.orElse(null));
    }
}
