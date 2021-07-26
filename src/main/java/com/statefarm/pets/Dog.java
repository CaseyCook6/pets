package com.statefarm.pets;

import com.statefarm.food.Food;
import com.statefarm.interfaces.Actions;
import com.statefarm.interfaces.Care;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dog extends Pet implements Actions, Care {

    public Dog(String name, char sex, int age, ArrayList<Food> foods) {
        super(name, sex, age, foods);
    }

    @Override
    public String doTrick() {
        ArrayList<String> tricks = new ArrayList<>(Arrays.asList("rolled over", "shook your hand", "sat down", "ignored you"));
        Random random = new Random();
        int choice = random.nextInt(4);
        return this.getName() + tricks.get(choice);
    }

    @Override
    public String attack() {
        
        return null;
    }

    @Override
    public String takeToVet() {
        return null;
    }

    @Override
    public String feed() {
        return null;
    }

    @Override
    public String playWith() {
        return null;
    }

    @Override
    public String pet() {
        return null;
    }
}
