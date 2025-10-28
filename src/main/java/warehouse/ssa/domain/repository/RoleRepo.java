package warehouse.ssa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import warehouse.ssa.domain.entity.Role;

import java.util.UUID;

public interface RoleRepo extends JpaRepository<Role, UUID> {
}
