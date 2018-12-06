package org.academiadecodigo.pettolove.converters;

import org.academiadecodigo.pettolove.command.AnimalDTO;
import org.academiadecodigo.pettolove.persistence.model.Animal;
import org.academiadecodigo.pettolove.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalDTOToAnimal extends AbstractConverters<AnimalDTO, Animal> {

    private AnimalService animalService;

    @Autowired
    public void setAnimalService(AnimalService animalService) {
        this.animalService = animalService;
    }

    @Override
    public Animal convert(AnimalDTO animalDTO) {
        Animal animal = (animalDTO.getId() != null ? animalService.get(animalDTO.getId()) : new Animal());

        animal.setName(animalDTO.getName());
        animal.setBreed(animalDTO.getBreed());
        animal.setAnimalType(animalDTO.getAnimalType());
        animal.setDescription(animalDTO.getDescription());

        return animal;
    }
}
