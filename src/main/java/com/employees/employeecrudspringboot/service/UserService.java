package com.employees.employeecrudspringboot.service;

import com.employees.employeecrudspringboot.dto.UserDTO;
import com.employees.employeecrudspringboot.model.User;
import com.employees.employeecrudspringboot.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getUsers() {
        List<User>userList = userRepository.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }
}