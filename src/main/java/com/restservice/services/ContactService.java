package com.restservice.services;

import com.restservice.dao.ContactDAO;
import com.restservice.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService implements IContactService {

    @Autowired
    private ContactDAO contactDAO;

    @Override
    public void createOrUpdateContact(Contact contact) {
        contactDAO.save(contact);
    }

    @Override
    public void deleteContactById(String id) {
        contactDAO.remove(id);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactDAO.getAll();
    }

    @Override
    public Contact getContactByName(String name) {
        return contactDAO.get(name);
    }
}
