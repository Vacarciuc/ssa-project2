package warehouse.ssa.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "permissions")
public class Permission extends BaseEntity{
    private MethodEnum method;
    private String description;
    @ManyToMany(mappedBy = "permissionList")
    private List<User> userList;
}
