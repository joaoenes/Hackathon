package org.academiadecodigo.pettolove.converters;

import org.academiadecodigo.pettolove.command.AnimalDTO;
import org.academiadecodigo.pettolove.persistence.model.Animal;
import org.springframework.stereotype.Component;


@Component
public class AnimalToAnimalDTO extends AbstractConverters<Animal, AnimalDTO> {

    @Override
    public AnimalDTO convert(Animal animal) {

        AnimalDTO animalDTO = new AnimalDTO();

        animalDTO.setId(animal.getId());
        animalDTO.setName(animal.getName());
        animalDTO.setUserId(animal.getUserId());
        animalDTO.setRaca(animal.getRaca());
        animalDTO.setAnimalType(animal.getAnimalType());
        animalDTO.setDescription(animal.getDescription());

        return animalDTO;
    }
}
