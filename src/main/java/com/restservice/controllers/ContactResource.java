package com.restservice.controllers;

import com.restservice.model.Contact;
import com.restservice.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
@Path("/contacts")
public class ContactResource {

    @Autowired
    private ContactService contactService;

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GET
    @Path("/getByName/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Contact getContactByName(@PathParam("name") String name) {
        return contactService.getContactByName(name);
    }

    @POST
    @Path("/createOrUpdate/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveOrUpdate(Contact contact) {
        contactService.createOrUpdateContact(contact);
        if (null == contact.getId() || contact.getId().isEmpty())
            return Response.status(Response.Status.CREATED).entity("contact is created").build();
        else
            return Response.status(Response.Status.OK).entity("contact is updated").build();
    }

//    @PUT
//    @Path("/update/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response update(@PathParam("id") String id, Contact contact) {
//        contactService.createOrUpdateContact(contact);
//        return Response.status(Response.Status.OK).entity("contact is updated").build();
//
//    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") String id) {
        contactService.deleteContactById(id);
        return Response.status(Response.Status.OK).entity("contact is deleted").build();

    }

}
