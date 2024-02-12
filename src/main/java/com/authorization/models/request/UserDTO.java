package com.authorization.models.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserDTO {
    private String username;
    private String password;
    private String name;
}
