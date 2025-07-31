package com.java.core.functionalprogramming;


import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class ValidatorFuntions {

    public static Consumer<List<String>> validateStringMaxLength(String fieldName, String valueToCheck, int maxLength) {
        return (errors) -> {
            if (valueToCheck.length() > maxLength) {
                errors.add(MessageFormat.format("the field {0} has length over {1} characters", fieldName, maxLength));
            }
        };
    }

    public static Consumer<List<String>> validateStringMinLength(String fieldName, String valueToCheck, int minLength) {
        return (errors) -> {
            if (valueToCheck.length() < minLength) {
                errors.add(MessageFormat.format("the field {0} has length under {1} characters", fieldName, minLength));
            }
        };
    }

    public static Consumer<List<String>> validateNotEmpty(String fieldName, String valueToCheck) {
        return (errors) -> {
            if (Objects.equals(valueToCheck, "") || valueToCheck == null) {
                errors.add(MessageFormat.format("the field {0} is empty or null", fieldName));
            }
        };
    }

    public static Consumer<List<String>> validateCleanString(String fieldName, String valueToCheck) {
        return (errors) -> {
            String safeStringRegex = "^[a-zA-Z0-9\\s.,_-]+$";
            if (!valueToCheck.matches(safeStringRegex)) {
                errors.add(MessageFormat.format("the field {0} contain special characters", fieldName));
            }
        };
    }


}
