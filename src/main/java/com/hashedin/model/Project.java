package com.hashedin.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@XmlRootElement
@Entity
@Table(name = "projects")
@NamedQueries({ @NamedQuery(name = "Project.findAll", query = "SELECT p FROM Project p") })
public class Project {

	@XmlInverseReference(mappedBy = "project")
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "project", targetEntity = Task.class)
	private List<Task> tasks;

	public Project() {
		tasks = new ArrayList<Task>();
	}

	public List<Task> getTasks() {
		return tasks;
	}

	@Id
	@GeneratedValue
	private Long projectId;

	private String projectTitle;

	private String projectDesc;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

}