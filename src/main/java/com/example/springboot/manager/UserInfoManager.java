package com.example.springboot.manager;

import com.example.springboot.exception.InvalidParameterException;
import com.example.springboot.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserInfoManager {
    public String getUserById(long id) {
        if (id == 3L) {
            throw new ResourceNotFoundException("user 3 is not found");
        }
//        if (id <= 0L) {
//            throw new InvalidParameterException(String.format("user %s is invalid", id));
//        }
        return "This is user " + id;
    }
}
