package io.github.kevindoestechs.marketplace.product.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {
    @NotBlank(message = "Name must be filled")
    @Size(min = 3, max = 75, message = "Product name has to be 3 to 75 characters")
    private String name;

    @NotNull(message = "Price must be filled")
    @Positive(message = "Price has to be larger than 0")
    @Digits(integer = 10, fraction = 2, message = "Price has maximum 10 digits and fraction with 2 digits")
    private BigDecimal price;

    @NotBlank(message = "Description must be filled")
    @Size(max = 1000, message = "Description must be under 1000 characters")
    private String description;
}
