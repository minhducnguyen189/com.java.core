package com.java.core.annotation;

import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.Objects;

public class AnnotationMain {

    private static final String PARENT_GROUP_MESSAGE = "Class: {0} has groupName: {1} and usedInAnotherGroup: {2}";
    private static final String CHILD_GROUP_MESSAGE = "Class: {0} contains child group {1} which has groupName: {2} and usedInAnotherGroup: {3}";


    public static void main(String[] args) throws IllegalAccessException {
        PersonDto personDto = new PersonDto();
        personDto.setFirstName("John");
        personDto.setLastName("Wick");
        personDto.setAge("29");
        personDto.setAddress("3/115 Binh Thuan");

        DogDto dogDto = new DogDto();
        dogDto.setName("Pig Bull");
        dogDto.setFood("meat");
        personDto.setPet(dogDto);

        printGroupInformation(personDto);
        printGroupInformation(dogDto);
    }

    private static void printGroupInformation(Object object) {
        GroupMark groupMark = object.getClass().getAnnotation(GroupMark.class);
        System.out.println(MessageFormat.format(PARENT_GROUP_MESSAGE,
                object.getClass().getSimpleName(),
                groupMark.groupName(),
                groupMark.usedInAnotherGroup()));
        for (Field field : object.getClass().getDeclaredFields()) {
            GroupMark childGroupMark = field.getAnnotation(GroupMark.class);
            if (Objects.nonNull(childGroupMark)) {
                System.out.println(MessageFormat.format(CHILD_GROUP_MESSAGE,
                        object.getClass().getSimpleName(),
                        field.getType().getSimpleName(),
                        childGroupMark.groupName(),
                        childGroupMark.usedInAnotherGroup()));
            }
        }
    }


}
