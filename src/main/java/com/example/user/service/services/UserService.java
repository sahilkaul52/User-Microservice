package com.example.user.service.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.user.service.payload.UserDTO;

@Service
@Component
public interface UserService {

	public UserDTO createUser(UserDTO userdto);
	
	public UserDTO getUserById(String userId);
	
	public UserDTO updateUser(String userId, UserDTO userdto);
	
	public UserDTO deleteUser(String userId);
	
	public List<UserDTO> getListOfUser(List<String> userIds);
	
	public List<UserDTO> findAll();
}

