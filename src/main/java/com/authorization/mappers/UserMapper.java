package com.authorization.mappers;

import com.authorization.entities.User;
import com.authorization.models.request.RegisterUserDTO;
import com.authorization.models.response.RegisterUserResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userDtoToUser(RegisterUserDTO registerUserDTO);
    RegisterUserResponseDTO userToRegisterResponseDTO(User user);
}
