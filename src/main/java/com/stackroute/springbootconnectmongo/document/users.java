package com.stackroute.springbootconnectmongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class users {
    @Id
    private  int id;
    private  String name;
    private   int age;
    private  String teamname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public users(int id, String name, int age, String teamname) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.teamname = teamname;
    }

}
