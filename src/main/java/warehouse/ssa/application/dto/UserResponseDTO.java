package warehouse.ssa.application.dto;

import lombok.Data;
import warehouse.ssa.domain.entity.Method;

import java.util.List;

@Data
public class UserResponseDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
