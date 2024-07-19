package com.java.core.annotation;

@GroupMark(groupName = GroupNameEnum.ANIMAL)
public class DogDto {

    private String name;
    private String food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
