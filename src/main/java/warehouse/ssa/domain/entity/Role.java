package warehouse.ssa.domain.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "role")
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
