package com.example.demo.services;

import com.example.demo.Controllers.UserControler;
import com.example.demo.Model.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void registerUser(User user) {
        List<User> users = (List<User>) userRepository.findAll();
        if(users.stream().filter(u-> Objects.equals(u.getName(),user.getName())).findFirst().isPresent()){
            System.out.println("User exists");
        }else {
          userRepository.save(user);
        }
    }
    public void loginUser(User user) {
        List<User> users = (List<User>) userRepository.findAll();
        if(users.stream().filter(u-> Objects.equals(u.getName(),user.getName())).findFirst().isPresent()){
            System.out.println("User exists");
        }else {
            System.out.println("User not exists");
        }
    }
}
