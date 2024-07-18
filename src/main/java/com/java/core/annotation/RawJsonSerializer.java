package com.java.core.annotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class RawJsonSerializer {

    public String convertToJson(Object object) throws IllegalAccessException {
        if (Objects.isNull(object)) {
            throw new RuntimeException("can not serialize json with null object");
        }
        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(JsonSerializer.class)) {
            throw new RuntimeException("can not serialize json because the class is not annotated with JsonSerializer");
        }
        Map<String, String> jsonElementsMap = new HashMap<>();
        for (Field field: clazz.getDeclaredFields()) {
            field.setAccessible(true);
            jsonElementsMap.put(field.getName(), (String) field.get(object));
        }
        String jsonString = jsonElementsMap.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + jsonString + "}";
    }



}
