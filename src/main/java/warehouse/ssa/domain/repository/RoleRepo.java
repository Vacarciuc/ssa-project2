package warehouse.ssa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import warehouse.ssa.domain.entity.Role;
import warehouse.ssa.domain.entity.RoleEnum;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepo extends JpaRepository<Role, UUID> {

    Role findByName(RoleEnum name);
}
