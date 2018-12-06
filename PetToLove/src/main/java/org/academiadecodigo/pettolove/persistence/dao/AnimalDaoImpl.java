package org.academiadecodigo.pettolove.persistence.dao;

import org.academiadecodigo.pettolove.persistence.model.Animal;

public class AnimalDaoImpl extends AbstractDao<Animal> implements AnimalDao {

    public AnimalDaoImpl() {
        super(Animal.class);
    }
}
