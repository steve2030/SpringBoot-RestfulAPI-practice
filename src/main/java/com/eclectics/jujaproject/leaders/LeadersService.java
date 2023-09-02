package com.eclectics.jujaproject.leaders;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LeadersService {
   private List<Leader>leaders= Arrays.asList(
            new Leader(1, "john", "MP",47),
            new Leader(2,"Raphael", "Finance Director", 35)
    );
   public List<Leader> getLeaders(){
       return leaders;
    }
}
