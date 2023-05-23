package com.pew.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pew.entities.Reminder;

public interface ReminderRepository extends JpaRepository<Reminder, Integer>
{
}
