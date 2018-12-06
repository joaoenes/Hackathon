package org.academiadecodigo.pettolove.persistence.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal extends AbstractModel {

    @ManyToOne
    private User user;

    private String name;

    private String description;

    private String breed;

    private AnimalType animalType;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     /*@ManyToOne
    @ForeignKey(name = "id")*/
    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
