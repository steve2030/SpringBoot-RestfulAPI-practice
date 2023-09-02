package com.eclectics.jujaproject.Residents;

public class Resident {
    private long ResidentId;
    private String name;
    private String location;
    private int age;
    private String party;

//    constructor

    public Resident(long residentId, String name, String location, int age, String party) {
        ResidentId = residentId;
        this.name = name;
        this.location = location;
        this.age = age;
        this.party = party;
    }
//    getters and setters

    public long getResidentId() {
        return ResidentId;
    }

    public void setResidentId(long residentId) {
        ResidentId = residentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }


//    to string

    @Override
    public String toString() {
        return "Resident{" +
                "ResidentId=" + ResidentId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", party='" + party + '\'' +
                '}';
    }
}
