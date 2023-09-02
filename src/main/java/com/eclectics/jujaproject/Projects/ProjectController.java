package com.eclectics.jujaproject.Projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping(path="projects")

    public List<Project> getProjects(){
        return projectService.getProjects();
    }
}
