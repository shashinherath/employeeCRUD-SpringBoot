package com.employees.employeecrudspringboot.controller;

import com.employees.employeecrudspringboot.dto.UserDTO;
import com.employees.employeecrudspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public List<UserDTO> getUser() {
        return userService.getUsers();
    }
}
