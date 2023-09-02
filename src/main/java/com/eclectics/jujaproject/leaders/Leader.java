package com.eclectics.jujaproject.leaders;

public class Leader {
    private long leaderId;
    private String Name;
    private String Position;
    private int age;
//    constructor


    public Leader(long leaderId, String name, String position, int age) {
        this.leaderId = leaderId;
        Name = name;
        Position = position;
        this.age = age;
    }
//    getters and setters


    public long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(long leaderId) {
        this.leaderId = leaderId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    to string

    @Override
    public String toString() {
        return "Leader{" +
                "leaderId=" + leaderId +
                ", Name='" + Name + '\'' +
                ", Position='" + Position + '\'' +
                ", age=" + age +
                '}';
    }
}
