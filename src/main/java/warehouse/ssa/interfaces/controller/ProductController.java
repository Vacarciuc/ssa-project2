package warehouse.ssa.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import warehouse.ssa.application.dto.CreateProductDTO;
import warehouse.ssa.application.dto.CreateUserDTO;
import warehouse.ssa.application.dto.ProductResponseDTO;
import warehouse.ssa.application.service.ProductService;

import java.util.List;

@RestController()
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/ping")
    public String getPing() {return "Hello World from Products!";}

    @RequestMapping(
            name = "/find-all",
            method = RequestMethod.GET
    )
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts(){
        return ResponseEntity.ok(this.productService.getAllProducts());
    }

    @RequestMapping(
            name = "/add",
            method = RequestMethod.POST
    )
    public ResponseEntity<ProductResponseDTO> addProduct(
            @RequestBody CreateProductDTO createProductDTO
    ){
        return ResponseEntity.ok(this.productService.createProduct(createProductDTO));
    }

//    @RequestMapping(
//            name = "/get-by-serial",
//            method = RequestMethod.GET
//    )
//    public ResponseEntity<List<ProductResponseDTO>> getProductBySerialNumber(
//            @RequestBody String serialNumber
//    ){
//        return ResponseEntity.ok(this.productService.getProductBySerialNumber(serialNumber));
//    }
}
