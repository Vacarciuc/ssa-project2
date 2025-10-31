package warehouse.ssa.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString()
@Entity
@Table(name = "role")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private RoleEnum name;

    private String description;

    @OneToMany(mappedBy = "role")
    private List<User> userList;
}
