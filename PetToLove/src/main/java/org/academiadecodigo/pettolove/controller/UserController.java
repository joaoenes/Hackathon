package org.academiadecodigo.pettolove.controller;

import org.academiadecodigo.pettolove.converters.UserDTOToUser;
import org.academiadecodigo.pettolove.converters.UserToUserDTO;
import org.academiadecodigo.pettolove.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    private UserToUserDTO userToUserDTO;
    private UserDTOToUser userDTOToUser;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDTOToUser(UserDTOToUser userDTOToUser) {
        this.userDTOToUser = userDTOToUser;
    }

    @Autowired
    public void setUserToUserDTO(UserToUserDTO userToUserDTO) {
        this.userToUserDTO = userToUserDTO;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<UserDto> showCustomer(@PathVariable Integer id) {

        User user = userService.get(id);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userToUserDto.convert(user), HttpStatus.OK);
    }
}
