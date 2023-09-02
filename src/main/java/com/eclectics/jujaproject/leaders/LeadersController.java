package com.eclectics.jujaproject.leaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class LeadersController {
    @Autowired
    private LeadersService leaderService;
    @GetMapping(path="leaders")
    public List<Leader> getLeaders(){
        return leaderService.getLeaders();


    }
}
