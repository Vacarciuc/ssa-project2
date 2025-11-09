package warehouse.ssa.application.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.ssa.application.dto.CreateProductDTO;
import warehouse.ssa.application.dto.ProductResponseDTO;
import warehouse.ssa.application.mapper.ProductMapper;
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

    @Autowired
    ProductMapper productMapper;

    public ProductResponseDTO createProduct(CreateProductDTO productDTO){
        //List<Product> productList = this.productRepo.findBySerial(productDTO.getSerialNumber());
        //if (!productList.isEmpty()){
        //    return null;
        //}
        Product product = new Product();
        Category category = this.categoryRepo.findByName(productDTO.getCategory().getName());
        product.setName(productDTO.getName());
        product.setPrice(product.getPrice());
        product.setUnits(product.getUnits());
        product.setInventoryNumber(product.getInventoryNumber());
        product.setSerialNumber(product.getSerialNumber());
        product.setCategory(category);
        product.setRowNumber(productDTO.getRowNumber());
        product.setColumnNumber(productDTO.getColumnNumber());
        product.setDescription(productDTO.getDescription());
        Product savedProduct =  this.productRepo.save(product);
        return productMapper.toResponseDTO(savedProduct);
    }

    public List<ProductResponseDTO> getAllProducts(){
        List<Product> productList = this.productRepo.findAll();
        return productMapper.toResponseDTOListProduct(productList);
    }

//    public List<ProductResponseDTO> getProductBySerialNumber(String serialNumber){
//        List<Product> productList = this.productRepo.findBySerial(serialNumber);
//        return productMapper.toResponseDTOListProduct(productList);
//    }

}
