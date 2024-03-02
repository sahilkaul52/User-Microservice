package com.example.user.service.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.example.user.service.entities.User;
import com.example.user.service.payload.UserDTO;

@Component
@Mapper(componentModel = "spring")
public interface UserMapstruct
{
	  
	@Mapping(source="nationality", target= "origin")  // target refers to entity here and soucr refers to dto ka field
    User toEntity(UserDTO userdto);
    
    @Mapping(source= "origin", target="nationality")  
    UserDTO toDto(User user);
	
    
    List<UserDTO> toDtoList(List<User> users);
    
    
    List<User> toEntityList(List<UserDTO> userDTO);
    
	  
}
	
