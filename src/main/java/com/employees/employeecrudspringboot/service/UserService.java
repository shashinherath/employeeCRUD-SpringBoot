package com.employees.employeecrudspringboot.service;

import com.employees.employeecrudspringboot.dto.UserDTO;
import com.employees.employeecrudspringboot.model.User;
import com.employees.employeecrudspringboot.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers() {
        List<User>userList = userRepository.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>() {}.getType());
    }

    public UserDTO saveUser(UserDTO userDTO) {
        userRepository.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
}