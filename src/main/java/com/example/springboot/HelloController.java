package com.example.springboot;

import com.example.springboot.exception.ErrorResponse;
import com.example.springboot.exception.InvalidParameterException;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.manager.UserInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private UserInfoManager userInfoManager;

    @GetMapping("/{id}")
    public ResponseEntity<?> index(@PathVariable("id") long id) {
        if (id <= 0L) {
            throw new InvalidParameterException(String.format("user %s is invalid", id));
        }
        return ResponseEntity.ok(userInfoManager.getUserById(id));
    }

}