package com.example.split.Model;

public class User {
    
    private Integer userId;

    public User(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }
}
