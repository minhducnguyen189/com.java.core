package com.java.core.annotation;

@GroupMark(groupName = GroupNameEnum.HUMAN)
public class PersonDto {

    private String firstName;
    private String lastName;
    private String age;
    private String address;

    @GroupMark(groupName = GroupNameEnum.ANIMAL, usedInAnotherGroup = true)
    private DogDto pet;

    public PersonDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DogDto getPet() {
        return pet;
    }

    public void setPet(DogDto pet) {
        this.pet = pet;
    }
}
