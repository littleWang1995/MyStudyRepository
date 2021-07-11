package com.wj77.bean;

/**
 * @author jiewang
 */
public class User {
    private String username;
    private Integer age;
    private Pet pet;

    public User(String username, Integer age, Pet pet) {
        this.username = username;
        this.age = age;
        this.pet = pet;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
