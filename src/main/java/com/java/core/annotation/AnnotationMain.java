package com.java.core.annotation;

public class AnnotationMain {

    public static void main(String[] args) throws IllegalAccessException {
        RawJsonSerializer rawJsonSerializer = new RawJsonSerializer();
        PersonDto personDto = new PersonDto();
        personDto.setFirstName("John");
        personDto.setLastName("Wick");
        personDto.setAge("29");
        personDto.setAddress("3/115 Binh Thuan");

        System.out.println(rawJsonSerializer.convertToJson(personDto));
    }

}
