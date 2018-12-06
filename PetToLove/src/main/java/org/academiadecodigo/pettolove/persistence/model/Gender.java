package org.academiadecodigo.pettolove.persistence.model;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    String gender;

    Gender(String gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
