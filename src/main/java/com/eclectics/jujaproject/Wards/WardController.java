package com.eclectics.jujaproject.Wards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WardController {
   @Autowired
   private WardService wardService;
   @GetMapping(path = "wards")
   public List<Ward>getWards(){
       return wardService.getWards();
   }

}
