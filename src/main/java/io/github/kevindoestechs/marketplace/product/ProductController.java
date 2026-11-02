package io.github.kevindoestechs.marketplace.product;

import io.github.kevindoestechs.marketplace.product.dto.CreateProductRequest;
import io.github.kevindoestechs.marketplace.product.response.GetProductResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping("/{id}")
    public ResponseEntity<GetProductResponse> getProductById(@PathVariable Long id){
        return ResponseEntity.ok(
                GetProductResponse.builder()
                        .name("Phone")
                        .price(new BigDecimal("799.99"))
                        .description("A mobile phone")
                        .build()
        );
    }

    @GetMapping("")
    public ResponseEntity<List<GetProductResponse>> getAllProducts(){
        return ResponseEntity.ok(
                List.of(
                        GetProductResponse.builder()
                                .name("Phone")
                                .price(new BigDecimal("799.99"))
                                .description("A mobile phone")
                                .build(),
                        GetProductResponse.builder()
                                .name("Shoes")
                                .price(new BigDecimal("129"))
                                .description("A pair of shoes")
                                .build()
                )
        );
    }

    @PostMapping("/create-product")
    public ResponseEntity<?> createProduct(@Valid @RequestBody CreateProductRequest request){
        return ResponseEntity.ok(
            GetProductResponse.builder()
                    .name(request.getName())
                    .price(request.getPrice())
                    .description(request.getDescription())
                    .build()
        );
    }
}
