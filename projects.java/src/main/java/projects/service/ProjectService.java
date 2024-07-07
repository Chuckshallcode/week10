package projects.service;

import java.util.List;

import projects.dao.ProjectsDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectsDao projectDao = new ProjectsDao();
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}
		
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow();
	}
}
