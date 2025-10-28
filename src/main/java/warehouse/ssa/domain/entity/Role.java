package warehouse.ssa.domain.entity;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString()
@Entity
@Table(name = "users")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Date createdAt;
    private Date updatedAt;
    private boolean isActive;
    private String name;
    private String description;
    @OneToMany(mappedBy = "role")
    private List<User> userList;
}
