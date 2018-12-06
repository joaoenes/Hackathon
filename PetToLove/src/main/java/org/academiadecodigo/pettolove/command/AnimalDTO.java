package org.academiadecodigo.pettolove.command;

import org.academiadecodigo.pettolove.persistence.model.AnimalType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AnimalDTO {

    private Integer id;
    private Integer userID;

    @Size(max = 64)
    @Pattern(regexp = "[a-zA-Z ]*$")
    private String name;

    @NotBlank
    @NotNull
    private AnimalType animalType;

    @Size(max = 64)
    private String breed;

    @Size(max = 255)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AnimalDTO{" +
                "id=" + id +
                ", userID=" + userID +
                ", name='" + name + '\'' +
                ", animalType=" + animalType +
                ", breed='" + breed + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
