package com.eclectics.jujaproject.Residents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResidentController {
    @Autowired
    private ResidentService residentService;

    @GetMapping(value="residents")
    public List<Resident> getResidents(){
        return residentService.getResidents();

    }

}
