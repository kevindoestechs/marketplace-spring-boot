package io.github.kevindoestechs.marketplace.product.response;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {
    private String name;
    private BigDecimal price;
    private String description;
}
