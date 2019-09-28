package com.mohammed.recyclerviewwithfragment;

public class Data {

   private String fullName ,id, age ;

    Data(String id, String fullName, String age) {
        this.id = id;
        this.age = age;
        this.fullName = fullName;
    }
    //setter

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    //getter

    String getId() {
        return id;
    }

    String getAge() {
        return age;
    }

    String getFullName() {
        return fullName;
    }
}
