package com.Ghassen.ShopMB.service.product;




import com.Ghassen.ShopMB.dto.ProductDto;
import com.Ghassen.ShopMB.model.Product;
import com.Ghassen.ShopMB.requestSchema.AddProductRequest;
import com.Ghassen.ShopMB.requestSchema.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);

    // List<Product> getDistinctProductsByCategory();
    List<Product> findDistinctProductsByName();
    List<String> getAllDistinctBrands();
}
