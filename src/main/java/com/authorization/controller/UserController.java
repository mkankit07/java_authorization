package com.authorization.controller;

import com.authorization.entities.User;
import com.authorization.models.request.RegisterUserDTO;
import com.authorization.models.response.RegisterUserResponseDTO;
import com.authorization.services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/api/auth")
@Tag(name = "user")
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/register",consumes = "application/json" )
    public RegisterUserResponseDTO registerNewUserAccount(@Valid @RequestBody RegisterUserDTO registerUserDTO) {
        return userService.registerUser(registerUserDTO);
    }
}
