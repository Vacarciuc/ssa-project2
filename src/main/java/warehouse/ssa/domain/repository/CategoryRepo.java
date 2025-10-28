package warehouse.ssa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import warehouse.ssa.domain.entity.Category;

import java.util.UUID;

public interface CategoryRepo extends JpaRepository<Category, UUID> {
}
