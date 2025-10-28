package warehouse.ssa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import warehouse.ssa.domain.entity.Product;

import java.util.UUID;

@RepositoryRestController
public interface ProductRepo extends JpaRepository<Product, UUID> {
}
