package com.eclectics.jujaproject.Wards;

public class Ward {
    private long WardId;
    private String wardName;
    private int population;

//    constructors


    public Ward(long wardId, String wardName, int population) {
        WardId = wardId;
        this.wardName = wardName;
        this.population = population;
    }

//    getters and setters


    public long getWardId() {
        return WardId;
    }

    public void setWardId(long wardId) {
        WardId = wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

//    to string

    @Override
    public String toString() {
        return "Ward{" +
                "WardId=" + WardId +
                ", wardName='" + wardName + '\'' +
                ", population=" + population +
                '}';
    }
}
