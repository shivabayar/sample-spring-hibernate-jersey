package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Project;
import com.hashedin.model.Task;
import com.hashedin.repository.ProjectRepository;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
    private ProjectRepository projectRepository;

	@Override
	public Project find(Long projectId) {
		 // Returns the Task for given taskId.
        return projectRepository.find(projectId);
	}

	@Override
	public List<Project> findAll() {
		// Returns all the tasks in our system.
        return projectRepository.findAll();
	}

	@Transactional
	public Project save(Project project) {
		 // Saves the given task object and returns the same.
		projectRepository.save(project);
        return project;
	}

	@Override
	public Project update(Project project, Long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Project delete(Long projectId) {
		  // Deletes the task with the give taskId and returns the same.
        return projectRepository.delete(projectId);
	}

	@Override
	public List<Task> findAllTasksByProjectId(long projectId) {
		
		return projectRepository.find(projectId).getTasks();
	}

}
