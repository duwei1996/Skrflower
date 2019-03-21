package com.skrflower.backend.bean;

public class User {

    private Integer userId;
    private String username;
    private String password;
    private String email;
    private Integer age;
    private String gender;
    private boolean alive;

    public User() {
    }

    public User(Integer userId, String username, String password, String email, Integer age, String gender, boolean alive) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.alive = alive;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "[" + userId + "," + username + "," + password + "]";
    }
}
