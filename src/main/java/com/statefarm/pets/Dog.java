package com.statefarm.pets;

import com.statefarm.food.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dog extends Pet {

    private boolean isNeutered;
    private boolean isSpayed;

    public Dog(String name, char sex, int age, ArrayList<Food> foods) {
        super(name, sex, age, foods);
    }

    @Override
    public String doTrick() {
        List<String> tricks = new ArrayList<>(Arrays.asList("rolled over", "shook your hand", "sat down", "ignored you"));
        Random random = new Random();
        int choice = random.nextInt(4);
        return this.getName() + " " + tricks.get(choice);
    }

    @Override
    public String attack() {
        ArrayList<String> attacks = new ArrayList<>(Arrays.asList("bit you", "licked you to death", "growled at you"));
        Random random = new Random();
        int choice = random.nextInt(3);
        return this.getName() + " " + attacks.get(choice);
    }

    @Override
    public void takeToVet() {
        setSick(false);
        if (this.getSex() == 'M') {
            isNeutered = true;
        } else {
            isSpayed = true;
        }
    }

    @Override
    public String playWith() {
        return "You threw the ball for " + this.getName();
    }

    public boolean isFixed() {
        if (this.getSex() == 'M') {
            return isNeutered;
        } else {
            return isSpayed;
        }
    }

}
