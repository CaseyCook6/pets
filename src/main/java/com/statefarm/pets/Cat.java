package com.statefarm.pets;

import com.statefarm.food.Food;

import java.util.ArrayList;

public class Cat extends Pet {
    public Cat(String name, char sex, int age, ArrayList<Food> foods) {
        super(name, sex, age, foods);
    }
}
