package org.academiadecodigo.pettolove.controller;

import org.academiadecodigo.pettolove.services.AnimalService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/animal")
public class AnimalController {

    private AnimalService animalService;

}
