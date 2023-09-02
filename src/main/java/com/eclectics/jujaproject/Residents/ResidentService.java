package com.eclectics.jujaproject.Residents;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ResidentService {
    private List<Resident> residents= Arrays.asList(
            new Resident(1, "Mathew", "Juja farm", 34,"NASA"),
            new Resident(2, "James Mwaura", "Juja Town", 38, "Democratic Trust Party"),
            new Resident(3, "Emmanuel Barasa", "Kalimoni", 56, "The republic Party"),
            new Resident(4, "Michael Mugo", "Kenya Road Region", 29, "Sabina Party"),
            new Resident (5, "Gabriel Junguna", "Ruiru Township ward", 46,"Maendeleo Chap Chap")
    );
    public List<Resident>getResidents(){





        return residents;
    }
}
