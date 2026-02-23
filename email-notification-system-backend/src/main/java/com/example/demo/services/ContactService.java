package com.example.demo.services;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository contactRepository;

    public void save()
    {
        Contact contact = new Contact();
        contact.setName("Cauã Andrade");
        contact.setEmail("caua@gmail.com");
        contact.setTelephone("28999745874");
        contact.setCreatedAt(Instant.now());
        contact.setUpdatedAt(Instant.now());

        contactRepository.save(contact);
    }
}
