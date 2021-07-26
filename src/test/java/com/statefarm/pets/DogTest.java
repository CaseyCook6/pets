package com.statefarm.pets;

import com.statefarm.food.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DogTest {

    Dog dog;
    Dog femaleDog;
    Food testFood1;
    Food testFood2;
    Food testFood3;
    ArrayList<Food> foods;


    @BeforeEach
    public void setUpDog() {
        testFood1 = new Food("kibble");
        testFood2 = new Food("bones");
        testFood3 = new Food("table scraps");
        foods = new ArrayList<>(Arrays.asList(testFood1, testFood2, testFood3));

        dog = new Dog("Bob", 'm', 3, foods);
        femaleDog = new Dog("Linda", 'f', 2, foods);
    }

    @Test
    public void doTrick() {
        String actual = dog.doTrick();
        List<String> trickReturns = new ArrayList<>(Arrays.asList(dog.getName() + " rolled over", dog.getName() + " shook your hand", dog.getName() + " sat down", dog.getName() + " ignored you"));
        assertTrue(trickReturns.contains(actual));
    }

    @Test
    public void attack() {
        String actual = dog.attack();
        ArrayList<String> attacks = new ArrayList<>(Arrays.asList(dog.getName() + " bit you", dog.getName() + " licked you to death", dog.getName() + " growled at you"));
        assertTrue(attacks.contains(actual));
    }

    @Test
    public void takeToVetSetSick() {
        dog.setSick(true);
        dog.takeToVet();
        boolean result = dog.isSick();
        assertEquals(false, result);
    }

    @Test
    public void takeToVetSetNeutered() {
        dog.takeToVet();
        boolean result = dog.isFixed();
        assertEquals(true, result);
    }

    @Test
    public void takeToVetSetSpayed() {
        femaleDog.takeToVet();
        boolean result = femaleDog.isFixed();
        assertEquals(true, result);
    }

    @Test
    public void playWith() {
        String result = femaleDog.playWith();
        assertEquals("You threw the ball for Linda. Now she is hungry.", result);
    }

    @Test
    public void playWithHunger(){
        dog.playWith();
        boolean result = dog.isHungry();
        assertEquals(true, result);
    }

}
