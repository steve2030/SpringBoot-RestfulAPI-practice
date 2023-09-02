package com.eclectics.jujaproject.Wards;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class WardService {
    private List<Ward> wards= Arrays.asList(
            new Ward(1, "Mugutha", 2400),
            new Ward(2, "Kimbo", 45000),
            new Ward(3, "Ruiru", 359000)
    );
    public List<Ward>getWards(){
        return wards;
    }
}
