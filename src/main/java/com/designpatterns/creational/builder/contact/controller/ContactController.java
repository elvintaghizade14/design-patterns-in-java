package com.designpatterns.creational.builder.contact.controller;

import com.designpatterns.creational.builder.contact.bean.Contact;
import com.designpatterns.creational.builder.contact.bean.ContactBuilder;

import java.util.ArrayList;
import java.util.List;

public class ContactController {

  public List<Contact> getContacts() {
    List<Contact> contacts = new ArrayList<>();

    // version #1
    Contact contact1 = new Contact();
    contact1.setFirstName("Elvin");
    contact1.setLastName("Taghizade");
    contact1.setEmailAddress("elvintaghiyev184@gmail.com");
    contacts.add(contact1);

    // version #2
    contacts.add(new Contact("Second", "Contact", null));

    // version #3
    contacts.add(new ContactBuilder().setFirstName("Third").setLastName("Contact").buildContact());

    return contacts;
  }

}