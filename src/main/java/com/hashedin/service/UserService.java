package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Task;
import com.hashedin.model.User;

public interface UserService {
	
	User find(Long taskId);
    List<User> findAll();
    User save(User user);
    User update(User user, Long userId);
    User delete(Long taskId);
    List<Task> findAllTasksByUserId(long userId);
}
