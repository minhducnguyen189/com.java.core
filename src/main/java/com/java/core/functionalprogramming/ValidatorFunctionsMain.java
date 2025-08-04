package com.java.core.functionalprogramming;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ValidatorFunctionsMain {

    public static void main(String[] args) {

        Product product = new Product();
        product.setDescription("Iphone 15");
        product.setName("Iphone 15");
        product.setPrice(BigDecimal.valueOf(100.0));

        List<String> errors = new ArrayList<>();

        ValidatorFuntions
                .validateNotEmpty(Product.Fields.name, product.name)
                .andThen(ValidatorFuntions.validateCleanString(Product.Fields.name, product.name))
                .andThen(ValidatorFuntions.validateStringMinLength(Product.Fields.name, product.name, 3))
                .andThen(ValidatorFuntions.validateStringMaxLength(Product.Fields.name, product.name, 100))
                .andThen(ValidatorFuntions.validateNotEmpty(Product.Fields.description, product.description))
                .andThen(ValidatorFuntions.validateCleanString(Product.Fields.description, product.description))
                .andThen(ValidatorFuntions.validateStringMinLength(Product.Fields.description, product.description, 3))
                .andThen(ValidatorFuntions.validateStringMaxLength(Product.Fields.description, product.description, 500))
                .accept(errors);

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.valueOf(errors));
        }
    }


    @Getter
    @Setter
    @FieldNameConstants
    public static class Product {

        private String name;
        private String description;
        private BigDecimal price;
    }

}