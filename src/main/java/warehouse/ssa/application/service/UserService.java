package warehouse.ssa.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import warehouse.ssa.application.dto.CreateUserDTO;
import warehouse.ssa.application.dto.UserResponseDTO;
import warehouse.ssa.application.mapper.UserMapper;
import warehouse.ssa.domain.entity.Role;
import warehouse.ssa.domain.entity.RoleEnum;
import warehouse.ssa.domain.entity.User;
import warehouse.ssa.domain.repository.RoleRepo;
import warehouse.ssa.domain.repository.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    private final PasswordEncoder passwordEncoder;
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Autowired
    public UserService(UserRepo userRepo, PasswordEncoder passwordEncoder, RoleRepo roleRepo){
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.passwordEncoder = passwordEncoder;

    }

    @Autowired
    UserMapper userMapper;

    public UserResponseDTO addUser(CreateUserDTO userDTO){
        User userExists = this.userRepo.findByEmail(userDTO.getEmail());
        if (userExists.getFirstName() != null){
            return null;
        }
        User user = new User();
        Role role = this.roleRepo.findByName(userDTO.getRole());
        String encodedPass = this.encoderPassword(userDTO.getPassword());
        user.setRole(role);
        user.setPassword(encodedPass);
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        userRepo.save(user);
        return userMapper.toResponseDTO(user);
    }

    public List<User> getUsers(){
        return userRepo.findAll();
    }

    private String encoderPassword(String rawPass){
        return passwordEncoder.encode(rawPass);
    }
}
