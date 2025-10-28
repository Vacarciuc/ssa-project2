package warehouse.ssa.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Date createdAt;
    private Date updatedAt;
    private boolean isActive;
    private String name;
    private String description;
    private float price;
    private int units;
    private String serialNumber;
    private String inventoryNumber;
    private String columnNumber;
    private String rowNumber;
    @ManyToOne()
    @JoinColumn(name = "categoryId")
    private Category category;
}
