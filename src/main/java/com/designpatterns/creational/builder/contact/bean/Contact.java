package com.designpatterns.creational.builder.contact.bean;

public class Contact {
 private String firstName;
 private String lastName;
 private String emailAddress;

  public Contact() {
    super();
  }

  public Contact(String firstName, String lastName, String emailAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String toString() {
    return String.format("Contact[firstName='%s', lastName='%s', emailAddress='%s']", firstName, lastName, emailAddress);
  }
}