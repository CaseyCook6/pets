package com.statefarm.pets;

import com.statefarm.food.Food;

import java.util.ArrayList;

public class Pet {

    private String name;
    private char sex;
    private int age;
    private boolean isHungry;
    ArrayList<Food> food;

    public Pet(String name, char sex, int age, ArrayList<Food> food) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }


}
