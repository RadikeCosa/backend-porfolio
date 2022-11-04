package com.radike.porfolio.service;

import com.radike.porfolio.model.Projects;
import com.radike.porfolio.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService implements IProjectsService {

    @Autowired
    private ProjectsRepository projectsRepository;


    @Override
    public List<Projects> getProjects() {
        return projectsRepository.findAll();
    }

    @Override
    public void saveProjects(Projects projects) {
        projectsRepository.save(projects);
    }

    @Override
    public void deleteProjects(Long id) {
        projectsRepository.deleteById(id);
    }

    @Override
    public Projects findProject(Long id) {
        return projectsRepository.findById(id).orElse(null);
    }
}
