package warehouse.ssa.application.use_case;

import org.springframework.stereotype.Component;
import warehouse.ssa.application.dto.CreateProductDTO;
import warehouse.ssa.application.interfaces.UseCase;
import warehouse.ssa.domain.entity.Product;
import warehouse.ssa.domain.repository.ProductRepo;

@Component
public class CreateProductUseCase implements UseCase<CreateProductDTO, Product> {
    private final ProductRepo productRepo;

    public CreateProductUseCase(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product execute(CreateProductDTO input){
        return null;
    }
}
