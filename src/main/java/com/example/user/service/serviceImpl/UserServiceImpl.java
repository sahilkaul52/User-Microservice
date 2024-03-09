package com.example.user.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.user.service.entities.User;
import com.example.user.service.mapstruct.ContactMediumMapstruct;
import com.example.user.service.mapstruct.IdentificationMapstruct;
import com.example.user.service.mapstruct.UserMapstruct;
import com.example.user.service.payload.UserDTO;
import com.example.user.service.repository.UserRepository;
import com.example.user.service.services.UserService;



@Component
public class UserServiceImpl implements UserService
{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserMapstruct userMapstruct;
	
	@Autowired
	IdentificationMapstruct identificationMapstruct;
	
	@Autowired
	ContactMediumMapstruct contactMediumMapstruct;
	
	
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	
	public UserDTO createUser(UserDTO userdto)
	{
	
		logger.info("Creater user method invoked");
		
	   User user = userMapstruct.toEntity(userdto);
	   
	   user.setUserId(UUID.randomUUID().toString());
	   
	
		User createdUser = userRepository.save(user);
		
		UserDTO createdUserdto = userMapstruct.toDto(createdUser);
		
		return createdUserdto;
	}
	
	
	public UserDTO getUserById(String id)
	{
		
		Optional<User> optional = userRepository.findById(id);
		
		User user = optional.orElseThrow();
		
		UserDTO dto = userMapstruct.toDto(user);
		
		return dto;
		
	}
	
	
	public UserDTO updateUser(String id, UserDTO dto)
	{
		
		Optional<User> optional = userRepository.findById(id);
		
		User user = optional.orElseThrow();
		
		user.setEmail(dto.getEmail());
		user.setName(dto.getName());
		user.setOrigin(dto.getNationality());
	    
		user.setContactMedium(contactMediumMapstruct.toEntitylist(dto.getContactMediumDTO()));
		user.setUserIdentification(identificationMapstruct.toEntitylist(dto.getUserIdentificationDTO()));
		
		UserDTO updatedDTO = userMapstruct.toDto(user);
		
		return updatedDTO;
	}


	@Override
	public UserDTO deleteUser(String userId) {
		
	    Optional<User> optional = userRepository.findById(userId);
		
	    User user = optional.orElseThrow();
	    
		userRepository.deleteById(userId);
		
		UserDTO userdto= userMapstruct.toDto(user);
		
		return userdto;
	}


	@Override
	public List<UserDTO> getListOfUser(List<String> userIds) {
		
		List<User> allUsers = userRepository.findAllById(userIds);
		
		List<UserDTO> dtoList = userMapstruct.toDtoList(allUsers);
		
		return dtoList;
		
	}


	public List<UserDTO> findAll() 
	{
       List<User> allUser = userRepository.findAll();	
       
       List<UserDTO> allUserDTO = userMapstruct.toDtoList(allUser);
       
       return allUserDTO;
       
	}
	
	
}
