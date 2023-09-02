package com.eclectics.jujaproject.Projects;

public class Project {
    private long ProjectId;
    private String projectName;
    private String Location;
    private int budget;
    private String Description;

//    constructors

    public Project(long projectId, String projectName, String location, int budget, String description) {
        ProjectId = projectId;
        this.projectName = projectName;
        Location = location;
        this.budget = budget;
        Description = description;
    }

//    getters and setters

    public long getProjectId() {
        return ProjectId;
    }

    public void setProjectId(long projectId) {
        ProjectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

//    to string


    @Override
    public String toString() {
        return "Project{" +
                "ProjectId=" + ProjectId +
                ", projectName='" + projectName + '\'' +
                ", Location='" + Location + '\'' +
                ", budget=" + budget +
                ", Description='" + Description + '\'' +
                '}';
    }
}
