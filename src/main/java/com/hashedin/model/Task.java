package com.hashedin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "tasks")
@NamedQueries({ @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t") })
public class Task {

	@ManyToOne
	@JoinColumn(name="userId",referencedColumnName="userId")
	private User user;

	@Id
	@GeneratedValue
	private Long taskId;

	private String taskDesc;

	private String createDate;

	private String endDate;

	private String assignTo;

	private String closeDate;

	@ManyToOne
	@JoinColumn(name="projectId",referencedColumnName="projectId")
	private Project project;

//	public Task() {
//	}

	public String getAssignTo() {
		return assignTo;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public Long getId() {
		return this.taskId;
	}

	public Project getProject() {
		return project;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public User getUser() {
		return user;
	}

	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setId(Long id) {
		this.taskId = id;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public void setUser(User user) {
		this.user = user;
	}

}