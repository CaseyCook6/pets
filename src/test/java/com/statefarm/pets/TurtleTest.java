package com.statefarm.pets;

import com.statefarm.food.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TurtleTest {

    private Turtle turtle;
    private Food food1;
    private Food food2;
    private ArrayList<Food> foods;

    @BeforeEach
    public void setUp() {
        food1 = new Food("lettuce");
        food2 = new Food("tuna");
        foods = new ArrayList<>(Arrays.asList(food1, food2));
        turtle = new Turtle("Bubbles", 'M', 1, foods, 4, "box turtle");
    }

    @Test
    public void doTrick() {
        List<String> tricks = new ArrayList<>(Arrays.asList("solved math problems", "did kung-fu", "chased his calcium bone", "explored space and time"));
        for(int i = 0; i < tricks.size(); i++) tricks.set(i, turtle.getName() + " " + tricks.get(i));
        String result = turtle.doTrick();
        assertTrue(tricks.contains(result));
    }


}
