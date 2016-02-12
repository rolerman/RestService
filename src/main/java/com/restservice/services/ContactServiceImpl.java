package com.restservice.services;

import com.restservice.dao.ContactRepository;
import com.restservice.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void createOrUpdateContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void deleteContactById(String id) {
        contactRepository.remove(id);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.getAll();
    }

    @Override
    public Contact getContactByName(String name) {
        return contactRepository.get(name);
    }
}
