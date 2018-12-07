package org.academiadecodigo.pettolove.persistence.model;

public enum Gender {

    MALE("male"),
    FEMALE("female");

    String gender;

    Gender(String gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
