package com.eclectics.jujaproject.Projects;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {
    private List<Project>projects= Arrays.asList(
            new Project(1, "Kariba Dam", "Murela Kimbo", 34000, "To facilitated water harvesting within the Kimbo and its environments"),
            new Project(2, "Ruiru Market stalls", "Ruiru Market Centre", 4000000, "The project was initiated a s way to facilited and renovate the Ruiru market center as per the county government mission in safeguarding sustainable livelihood for its citizens")

            );
    public List<Project>getProjects(){
        return projects;
    }
}
