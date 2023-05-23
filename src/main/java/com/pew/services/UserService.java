package com.pew.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pew.entities.Users;
import com.pew.repositories.ReminderRepository;
import com.pew.repositories.UserRepository;

@Service
public class UserService
{
	@Autowired private UserRepository userRepository;

	public void saveRecordOfUser(Users user) 
	{
		userRepository.save(user);
		
	}
	
}
