package com.authorization.models.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterUserDTO {
    private String username;
    private String password;
    private String name;
    private String email;
    private String gender;
}
