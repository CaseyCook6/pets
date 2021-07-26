package com.statefarm.pets;

import com.statefarm.food.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Alligator extends Pet {

    private int length;

    public Alligator(String name, char sex, int age, ArrayList<Food> foods, int length) {
        super(name, sex, age, foods);
        this.length = length;

    }

    @Override
    public String attack() {
        ArrayList<String> attacks = new ArrayList<>(Arrays.asList("snapped at you", "bit you", "lunged at you...you peed a little"));
        Random random = new Random();
        int choice = random.nextInt(3);
        return getName() + " " + attacks.get(choice);
    }

    @Override
    public String playWith() {
        setHungry(false);
        return "You are now dead" + getName() + " is full";
    }

    @Override
    public String pet() {
        setHungry(true);
        return "You are now missing a hand...was it worth it?";
    }
}
