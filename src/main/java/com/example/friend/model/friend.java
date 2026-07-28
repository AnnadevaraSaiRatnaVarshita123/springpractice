package com.example.friend.model;

public class friend {
    private String name;
    private String city;
    private Integer age;

    public friend() {
    }

    public friend(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public friend(Integer age) {
        this.age = age;
    }

    public friend(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void friend(String name) {
        this.name = name;
    }
}
