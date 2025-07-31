package com.java.core.functionalprogramming;

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
                .validateNotEmpty("name", product.name)
                .andThen(ValidatorFuntions.validateCleanString("name", product.name))
                .andThen(ValidatorFuntions.validateStringMinLength("name", product.name, 3))
                .andThen(ValidatorFuntions.validateStringMaxLength("name", product.name, 100))
                .andThen(ValidatorFuntions.validateNotEmpty("description", product.description))
                .andThen(ValidatorFuntions.validateCleanString("description", product.description))
                .andThen(ValidatorFuntions.validateStringMinLength("description", product.description, 3))
                .andThen(ValidatorFuntions.validateStringMaxLength("description", product.description, 500))
                .accept(errors);

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.valueOf(errors));
        }
    }


    public static class Product {

        private String name;
        private String description;
        private BigDecimal price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }
    }

}