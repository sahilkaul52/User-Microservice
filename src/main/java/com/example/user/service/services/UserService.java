package com.example.user.service.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.user.service.payload.UserDTO;

@Service
@Component
public interface UserService {

	public UserDTO createUser(UserDTO userdto);
	
	
}


