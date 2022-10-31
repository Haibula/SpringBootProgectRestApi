package com.example.demo.Controllers;

import com.example.demo.Model.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserControler {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public ResponseEntity login(@RequestBody User user) {
        userService.loginUser(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok(user);
    }

}