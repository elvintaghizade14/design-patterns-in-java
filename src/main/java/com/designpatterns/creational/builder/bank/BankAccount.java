package com.designpatterns.creational.builder.bank;

public class BankAccount {
  private String name;
  private String surname;
  private String accountNumber;
  private String email;
  private boolean newsletter;

  public BankAccount(String name, String surname, String accountNumber, String email, boolean newsletter) {
    this.name = name;
    this.surname = surname;
    this.accountNumber = accountNumber;
    this.email = email;
    this.newsletter = newsletter;
  }

  public BankAccount(BankAccountBuilder bankAccountBuilder) {
    this.name = bankAccountBuilder.getName();
    this.surname = bankAccountBuilder.getSurname();
    this.accountNumber = bankAccountBuilder.getAccountNumber();
    this.email = bankAccountBuilder.getEmail();
    this.newsletter = bankAccountBuilder.wantsNewsletter();
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getEmail() {
    return email;
  }

  public boolean isNewsletter() {
    return newsletter;
  }
}