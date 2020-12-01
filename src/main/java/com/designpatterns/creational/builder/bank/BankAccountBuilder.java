package com.designpatterns.creational.builder.bank;

public class BankAccountBuilder {
  private final String name;
  private final String surname;
  private final String accountNumber;
  private String email;
  private boolean newsletter;

  public BankAccountBuilder(String name, String surname, String accountNumber) {
    this.name = name;
    this.surname = surname;
    this.accountNumber = accountNumber;
  }

  public BankAccountBuilder withEmail(String email) {
    this.email = email;
    return this;
  }

  public BankAccountBuilder wantsNewsletter(boolean newsletter) {
    this.newsletter = newsletter;
    return this;
  }

  public BankAccount build() {
    return new BankAccount(this);
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

  public boolean wantsNewsletter() {
    return newsletter;
  }
}