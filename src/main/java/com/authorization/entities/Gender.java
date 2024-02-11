package com.authorization.entities;


import com.authorization.exceptions.InvalidArgumentException;
import lombok.Getter;

@Getter
public enum Gender {
    MALE(1),
    FEMALE(2),
    OTHER(3);

    private final int value;
    Gender(int value){
        this.value=value;
    }

    public static Gender getValidGender(String genderName){
        Gender gender;
        try {
            gender=Gender.valueOf(genderName);
        }catch (IllegalArgumentException ex){
            throw new InvalidArgumentException("Invalid gender");
        }
        return gender;
    }
}