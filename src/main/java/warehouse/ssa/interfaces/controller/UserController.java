package warehouse.ssa.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import warehouse.ssa.application.dto.CreateUserDTO;
import warehouse.ssa.application.dto.UserResponseDTO;
import warehouse.ssa.application.service.UserService;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/ping")
    public String getPing(){
        return "Hello World from Users!";
    }

    @PostMapping("/add-user")
    public ResponseEntity<UserResponseDTO> addUser(@RequestBody CreateUserDTO userDTO){
        UserResponseDTO savedUser = userService.addUser(userDTO);
        return ResponseEntity.ok(savedUser);
    }

    @RequestMapping(
            name = "/find-all",
            method = RequestMethod.GET
    )
    public ResponseEntity<List<UserResponseDTO>> getUsers(){
        List<UserResponseDTO> userList = userService.getUsers();
        return ResponseEntity.ok(userList);
    }
}
