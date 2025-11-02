package warehouse.ssa.application.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.ssa.domain.entity.Category;
import warehouse.ssa.domain.entity.Product;
import warehouse.ssa.domain.repository.CategoryRepo;
import warehouse.ssa.domain.repository.ProductRepo;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;

    @Autowired
    public ProductService(ProductRepo productRepo, CategoryRepo categoryRepo){
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    public Product createProduct(Product product){
        return this.productRepo.save(product);
    }

    public List<Product> getAllProducts(){
        return this.productRepo.findAll();
    }

}
