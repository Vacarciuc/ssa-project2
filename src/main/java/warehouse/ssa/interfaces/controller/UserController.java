package warehouse.ssa.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import warehouse.ssa.application.dto.UserResponseDTO;
import warehouse.ssa.application.mapper.UserMapper;
import warehouse.ssa.application.service.UserService;
import warehouse.ssa.domain.entity.User;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User savedUser = userService.addUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @RequestMapping(
            name = "/findAll",
            method = RequestMethod.GET
    )
    public ResponseEntity<List<UserResponseDTO>> getUsers(){
        List<User> userList = userService.getUsers();
        return ResponseEntity.ok(userMapper.toResponseDTOList(userList));
    }
}
