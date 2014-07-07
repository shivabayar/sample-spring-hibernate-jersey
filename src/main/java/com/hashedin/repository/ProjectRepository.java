package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Project;

public interface ProjectRepository {

    Project find(Long projectId);
    List<Project> findAll();
    Project save(Project project);
    Project update(Project project, Long projectId);
    Project delete(Long projectId);

}
