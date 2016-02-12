package com.restservice.dao;

import com.restservice.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactRepository {

    @Autowired
    private MongoOperations mongoOperations;

    public void save(Contact contact) {
        mongoOperations.save(contact);
    }

    public Contact get(String name) {
        return mongoOperations.findOne(Query.query(Criteria.where("name").is(name)), Contact.class);
    }

    public List<Contact> getAll() {
        return mongoOperations.findAll(Contact.class);
    }

    public void remove(String id) {
        mongoOperations.remove(Query.query(Criteria.where("id").is(id)), Contact.class);
    }
}
