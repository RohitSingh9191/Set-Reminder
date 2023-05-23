package com.pew.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pew.entities.Reminder;
import com.pew.repositories.ReminderRepository;

@Service
public class ReminderService 
{
	
	@Autowired
	private ReminderRepository reminderRepository;
	public void saveRecord(Reminder studentReg)
	{
		reminderRepository.save(studentReg);
		
	}
	public Reminder getRecord(int sid) {
	
		return reminderRepository.findById(sid).orElse(null);
	}
	
	
	
	
}
