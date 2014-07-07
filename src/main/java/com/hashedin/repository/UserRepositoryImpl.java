package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Task;
import com.hashedin.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public User find(Long userId) {
		// TODO Auto-generated method stub
		return em.find(User.class, userId);
	}

	@Override
	public List<User> findAll() {
		TypedQuery<User> query = em
				.createNamedQuery("User.findAll", User.class);
		List<User> results = query.getResultList();
		return results;
	}

	@Override
	public User save(User user) {
		// Saves the given task object and returns the same.
		em.persist(user);
		em.flush();
		return user;
	}

	@Override
	public User update(User user, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(Long userId) {
		User userToBeDeleted = em.find(User.class, userId);
		em.remove(userToBeDeleted);
		return userToBeDeleted;
	}

	@Override
	public List<Task> findAllTasksByUserId(long userId) {
		// TODO Auto-generated method stub
		return em.find(User.class, userId).getTasks();
	}

}
