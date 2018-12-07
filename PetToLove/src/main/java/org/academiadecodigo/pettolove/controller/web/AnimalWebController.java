package org.academiadecodigo.pettolove.controller.web;

import org.academiadecodigo.pettolove.command.AnimalDTO;
import org.academiadecodigo.pettolove.converters.AnimalDTOToAnimal;
import org.academiadecodigo.pettolove.converters.UserToUserDTO;
import org.academiadecodigo.pettolove.persistence.model.Animal;
import org.academiadecodigo.pettolove.services.AnimalService;
import org.academiadecodigo.pettolove.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class AnimalWebController {

    private UserService userService;
    private AnimalService animalService;

    private UserToUserDTO userToUserDTO;
    private AnimalDTOToAnimal animalDTOToAnimal;

    @Autowired
    public void setAnimalService(AnimalService animalService) {
        this.animalService = animalService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserToUserDTO(UserToUserDTO userToUserDTO) {
        this.userToUserDTO = userToUserDTO;
    }

    @Autowired
    public void setAnimalDTOToAnimal(AnimalDTOToAnimal animalDTOToAnimal) {
        this.animalDTOToAnimal = animalDTOToAnimal;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/animal"})
    public String listAnimals(Model model) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/user/{uid}/animal"})
    public String addAnimal(@PathVariable Integer uid, @Valid @ModelAttribute("animal") AnimalDTO animalDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "redirect:/user/" + uid;
        }
            Animal animal = animalDTOToAnimal.convert(animalDTO);
            userService.addAnimal(uid, animal);
            redirectAttributes.addFlashAttribute("lastAction", "Created animal.");
            return "redirect:/user/" + uid;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/{uid}/account/{aid}/remove")
    public String removeAnimal(@PathVariable Integer uid, @PathVariable Integer aid, RedirectAttributes redirectAttributes) {

            userService.removeAnimal(uid, aid);
            redirectAttributes.addFlashAttribute("lastAction", "Removed animal " + aid);
            return "redirect:/user/" + uid;

    }



}
