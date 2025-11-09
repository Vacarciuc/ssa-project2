package warehouse.ssa.application.mapper;


import org.springframework.stereotype.Component;
import warehouse.ssa.application.dto.ProductResponseDTO;
import warehouse.ssa.domain.entity.Product;

import java.util.List;

@Component
public class ProductMapper {
    public ProductResponseDTO toResponseDTO(Product product){
        ProductResponseDTO dto = new ProductResponseDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setUnits(product.getUnits());
        dto.setInventoryNumber(product.getInventoryNumber());
        dto.setSerialNumber(product.getSerialNumber());
        dto.setColumnNumber(product.getColumnNumber());
        dto.setRowNumber(product.getRowNumber());
        dto.setDescription(product.getDescription());
        dto.setDescription(product.getDescription());
        return dto;
    }

    public List<ProductResponseDTO> toResponseDTOListProduct(List<Product> products){
        return products.stream()
                .map(this::toResponseDTO)
                .toList();
    }
}
