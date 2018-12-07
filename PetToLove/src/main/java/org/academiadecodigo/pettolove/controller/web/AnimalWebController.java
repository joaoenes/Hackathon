package org.academiadecodigo.pettolove.controller.web;

import org.academiadecodigo.pettolove.converters.UserToUserDTO;
import org.academiadecodigo.pettolove.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class AnimalWebController {

    private UserService userService;

    private UserToUserDTO userToUserDTO;

}
