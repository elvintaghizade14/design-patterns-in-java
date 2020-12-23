package com.designpatterns.creational.builder.contact;

import com.designpatterns.creational.builder.contact.bean.Contact;
import com.designpatterns.creational.builder.contact.controller.ContactController;

import java.util.List;
import java.util.stream.Collectors;

public class ContactApp {
  public static void main(String[] args) {
    ContactController contactController = new ContactController();

    List<Contact> contacts = contactController.getContacts();
    String resultString = contacts.stream().map(Contact::toString).collect(Collectors.joining("\n"));

    System.out.println(resultString);
  }
}