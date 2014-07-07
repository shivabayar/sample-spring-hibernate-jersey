package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.User;
import com.hashedin.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepository userRepository;

	@Override
	public User find(Long userId) {
		 // Returns the Task for given taskId.
        return userRepository.find(userId);
	}

	@Override
	public List<User> findAll() {
		 // Returns all the tasks in our system.
        return userRepository.findAll();
	}

	@Transactional
	public User save(User user) {
		  // Saves the given task object and returns the same.
		userRepository.save(user);
        return user;
	}

	@Override
	public User update(User user, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User delete(Long taskId) {
		// Deletes the task with the give taskId and returns the same.
        return userRepository.delete(taskId);
	}

}
