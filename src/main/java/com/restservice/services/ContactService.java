package com.restservice.services;


import com.restservice.model.Contact;

import java.util.List;

public interface ContactService {

    void createOrUpdateContact(Contact contact);

    void deleteContactById(String id);

    List<Contact> getAllContacts();

    Contact getContactByName(String name);

}
