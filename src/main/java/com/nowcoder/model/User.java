package com.nowcoder.model;

/**
 * Created by 546 on 2017/5/14.
 */
public class User {
    private String name;
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription(){
        return "this is "+name;
    }
}
