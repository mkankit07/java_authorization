package com.authorization.services;

import com.authorization.entities.User;
import com.authorization.models.request.LoginRequestDTO;
import com.authorization.models.request.RegisterUserDTO;
import com.authorization.models.response.RegisterUserResponseDTO;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public RegisterUserResponseDTO registerUser(RegisterUserDTO registerUserDTO);
    public User login(LoginRequestDTO loginRequestDTO);



}
