package com.radike.porfolio.controller;

import com.radike.porfolio.model.Projects;
import com.radike.porfolio.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;

    @GetMapping("/porfolio-service/projects/")
    public List<Projects> getProjects() {
        return projectsService.getProjects();
    }

    @PostMapping("/porfolio-service/projects/")
    public String createProjects(@RequestBody Projects projects) {
        projectsService.saveProjects(projects);
        return "el proyecto ya quedo guardado en una base de datos";
    }

    @DeleteMapping("/porfolio-service/projects/{id}")
    public String deleteProjects(@PathVariable Long id) {
        projectsService.deleteProjects(id);
        return "Eliminaste un pequeño proyectito que nunca vera el render";
    }

    @PutMapping("/porfolio-service/projects/{id}")
    public Projects editProjects(@PathVariable Long id,
                                 @RequestParam("name") String newName,
                                 @RequestParam("description") String newDescription,
                                 @RequestParam("repoUrl") String newRepoUrl,
                                 @RequestParam("deployUrl") String newDeployUrl,
                                 @RequestParam("image") String newImage,
                                 @RequestParam("version") String newVersion) {

        Projects projects = projectsService.findProject(id);

        projects.setName(newName);
        projects.setDescription(newDescription);
        projects.setRepoUrl(newRepoUrl);
        projects.setDeployUrl(newDeployUrl);
        projects.setImage(newImage);
        projects.setVersion(newVersion);

        projectsService.saveProjects(projects);

        return projects;
    }

}
