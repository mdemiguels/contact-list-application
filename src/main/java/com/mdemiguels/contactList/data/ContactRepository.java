package com.mdemiguels.contactList.data;

import com.mdemiguels.contactList.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
