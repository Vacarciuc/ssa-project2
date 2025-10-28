package warehouse.ssa.application.mapper;


import org.springframework.stereotype.Component;
import warehouse.ssa.application.dto.UserResponseDTO;
import warehouse.ssa.domain.entity.User;

import java.util.List;


@Component
public class UserMapper {
    public UserResponseDTO toResponseDTO(User user){
        System.out.println(user);
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        return dto;
    }

    public List<UserResponseDTO> toResponseDTOList(List<User> users) {
        return users.stream()
                .map(this::toResponseDTO)
                .toList();
    }
}
