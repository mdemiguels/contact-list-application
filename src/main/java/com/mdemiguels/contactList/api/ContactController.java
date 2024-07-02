package com.mdemiguels.contactList.api;

import com.mdemiguels.contactList.model.Contact;
import com.mdemiguels.contactList.data.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable Long id) {

        Optional<Contact> contact = contactRepository.findById(id);
        return contact.orElse(null);

    }

    @GetMapping
    public Iterable<Contact> getContact() {

        Iterable<Contact> contactList = contactRepository.findAll();
        return contactList;

    }

    @PostMapping("/save")
    public Contact createContact(@RequestBody Contact contact) {

        return contactRepository.save(contact);

    }
}
