package warehouse.ssa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import warehouse.ssa.domain.entity.Permission;

import java.util.UUID;

public interface PermissionRepo extends JpaRepository<Permission, UUID> {
}
