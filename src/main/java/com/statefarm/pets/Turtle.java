package com.statefarm.pets;

import com.statefarm.food.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Turtle extends Pet {

    private int shellLength;
    private String type;

    public Turtle(String name, char sex, int age, ArrayList<Food> foods, int shellLength, String type) {
        super(name, sex, age, foods);
        this.shellLength = shellLength;
        this.type = type;
    }

    @Override
    public String doTrick() {
        List<String> tricks = new ArrayList<>(Arrays.asList("solved math problems", "did kung-fu", "chased his calcium bone", "explored space and time"));
        Random random = new Random();
        int choice = random.nextInt(4);
        return this.getName() + " " + tricks.get(choice);
    }

}
