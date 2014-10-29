package com.restservice.services;


import com.restservice.model.Contact;

import java.util.List;

public interface IContactService {
    public void createOrUpdateContact(Contact contact);

    public void deleteContactById(String id);

    public List<Contact> getAllContacts();

    public Contact getContactByName(String name);

}
