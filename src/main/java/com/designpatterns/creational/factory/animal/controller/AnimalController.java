package com.designpatterns.creational.factory.animal.controller;

import com.designpatterns.creational.factory.animal.factory.Pet;
import com.designpatterns.creational.factory.animal.factory.PetFactory;

public class AnimalController {
  private final PetFactory petFactory;

  public AnimalController(PetFactory petFactory) {
    this.petFactory = petFactory;
  }

  public Pet adoptPet(String type, String name) {
    Pet pet = this.petFactory.createPet(type);
    pet.setName(name);
    pet.feed();
    return pet;
  }
}