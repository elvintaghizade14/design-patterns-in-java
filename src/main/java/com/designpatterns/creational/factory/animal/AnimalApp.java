package com.designpatterns.creational.factory.animal;

import com.designpatterns.creational.factory.animal.controller.AnimalController;
import com.designpatterns.creational.factory.animal.factory.Pet;
import com.designpatterns.creational.factory.animal.factory.PetFactory;

public class AnimalApp {
  public static void main(String[] args) {
    AnimalController animalController = new AnimalController(new PetFactory());

    Pet jacky = animalController.adoptPet("dog", "jacky");
    Pet milky = animalController.adoptPet("cat", "milky");

    System.out.println(jacky);
    System.out.println(milky);
  }
}