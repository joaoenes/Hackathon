package org.academiadecodigo.pettolove.persistence.model;

import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "animalType")
public class AnimalType extends AbstractModel {

    private String animalType;

}
