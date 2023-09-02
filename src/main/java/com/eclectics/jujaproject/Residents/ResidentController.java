

package com.eclectics.jujaproject.Residents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.xpath.XPath;
import java.nio.file.Path;
import java.util.List;

@RestController
public class ResidentController {
    @Autowired
    private ResidentService residentService;

    @GetMapping(value="residents")
    public List<Resident> getResidents(){
        return residentService.getResidents();

    }
    @GetMapping("{ResidentId}")

    public String getResident(@PathVariable String ResidentId){
        return residentService.getResident(ResidentId);


        }

}
