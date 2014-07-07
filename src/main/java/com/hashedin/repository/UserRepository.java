package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Task;
import com.hashedin.model.User;

public interface UserRepository {
	User find(Long userId);
    List<User> findAll();
    User save(User user);
    User update(User user, Long userId);
    User delete(Long userId);
    public List<Task> findAllTasksByUserId(long userId);

}
