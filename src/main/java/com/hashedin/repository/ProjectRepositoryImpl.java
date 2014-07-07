package com.hashedin.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.hashedin.model.Project;

@Repository("projectRepository")
public class ProjectRepositoryImpl implements ProjectRepository
{

    @PersistenceContext
    private EntityManager em;

	@Override
	public Project find(Long projectId) {
		// TODO Auto-generated method stub
        return em.find(Project.class, projectId);
	}

	@Override
	public List<Project> findAll() {
		TypedQuery<Project> query = em.createNamedQuery("Project.findAll", Project.class);
        List<Project> results = query.getResultList();
        return results;
	}

	@Override
	public Project save(Project project) {
		 // Saves the given task object and returns the same.
        em.persist(project);
        em.flush();
        return project;
	}

	@Override
	public Project update(Project project, Long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project delete(Long projectId) {
		Project projectToBeDeleted = em.find(Project.class, projectId); 
	        em.remove(projectToBeDeleted);
	        return projectToBeDeleted;
	}

}
