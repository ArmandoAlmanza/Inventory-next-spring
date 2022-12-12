package com.armando.user;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    record NewUserRequest(String userName, String userEmail, String userImagePath, String userPassword) {
    }

    record NewMessage(String message) {
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public void addUser(@RequestBody NewUserRequest req) {
        User user = new User();
        if (req.userName() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if (req.userImagePath() != null) {
            user.setUserImagePath(req.userImagePath());
        }

        user.setUserName(req.userName());
        user.setUserEmail(req.userEmail());
        user.setUserPassword(req.userPassword());
        userRepository.save(user);
    }
}
