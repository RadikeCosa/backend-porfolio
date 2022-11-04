package com.radike.porfolio.service;

import com.radike.porfolio.model.Projects;

import java.util.List;

public interface IProjectsService {

    public List<Projects> getProjects();

    public void saveProjects(Projects projects);

    public void deleteProjects(Long id);

    public Projects findProject(Long id);
}
