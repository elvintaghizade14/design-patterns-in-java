package com.designpatterns.creational.immutable_object;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Don’t define any setter methods
 * 5. Prevent methods from being overridden (make class final)
 */
public final class Animal {
    /**
     * 2. Mark all the instance variables private and final
     */
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    /**
     * 1. Use a constructor to set all properties of the object
     */
    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    /**
     * 4. Don’t allow referenced mutable objects to be modified or accessed directly
     */
    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    /**
     * 4. Don’t allow referenced mutable objects to be modified or accessed directly
     */
    public String getFavoriteFood(int index) {
        return favoriteFoods.get(index);
    }
}