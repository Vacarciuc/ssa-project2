package warehouse.ssa.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "permissions")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Date createdAt;
    private Date updatedAt;
    private boolean isActive;
    private Method method;
    private String description;
    @ManyToMany(mappedBy = "permissionList")
    private List<User> userList;
}
