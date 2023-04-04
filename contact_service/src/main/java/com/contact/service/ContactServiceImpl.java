package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L,"man@gmail.com","xyz",1311L),
            new Contact(2L,"sweets@gmail.com","abc",1311L),
            new Contact(3L,"kantij@gmail.com","asd",1312L),
            new Contact(4L,"ram@gmail.com","ddds",1314L)
    );
    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
