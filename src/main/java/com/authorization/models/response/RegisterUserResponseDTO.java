package com.authorization.models.response;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class RegisterUserResponseDTO {

    private String username;
    private UUID id;
    private String name;

}
