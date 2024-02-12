package com.authorization.services.impl;

import com.authorization.common.Constant;
import com.authorization.entities.User;
import com.authorization.exceptions.ConflictException;
import com.authorization.mappers.UserMapper;
import com.authorization.models.request.LoginRequestDTO;
import com.authorization.models.request.RegisterUserDTO;
import com.authorization.models.response.RegisterUserResponseDTO;
import com.authorization.repositories.ContactRepository;
import com.authorization.repositories.UserRepository;
import com.authorization.services.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ContactRepository contactRepository;
    private final UserMapper userMapper;

    @Override
    @Transactional
    public RegisterUserResponseDTO registerUser(RegisterUserDTO registerUserDTO) {
        if(userRepository.existsByUsername(registerUserDTO.getUsername())){
            throw new ConflictException(Constant.USER_CONFLICT);
        }
        registerUserDTO = registerUserDTO.toBuilder().password(passwordEncoder.encode(registerUserDTO.getPassword())).build();
        User user= userRepository.save(userMapper.userDtoToUser(registerUserDTO));
        return userMapper.userToRegisterResponseDTO(user);
    }

    @Override
    public User login(LoginRequestDTO loginRequestDTO) {
        return null;
    }
}
