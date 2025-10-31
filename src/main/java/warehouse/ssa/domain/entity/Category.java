package warehouse.ssa.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "category")
public class Category extends BaseEntity{
    private String name;
    private String description;
    @OneToMany(mappedBy = "category")
    private List<Product> productList;
}
