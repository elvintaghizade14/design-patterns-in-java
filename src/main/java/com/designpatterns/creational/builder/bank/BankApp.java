package com.designpatterns.creational.builder.bank;

public class BankApp {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccountBuilder("Elvin", "Taghizade", "123456789")
            .withEmail("elvintaghiyev184@gmail.com")
            .wantsNewsletter(Boolean.TRUE)
            .build();
  }
}