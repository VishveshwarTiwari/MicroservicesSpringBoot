package com.contact.conroller;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {


    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId)
    {
        return this.contactService.getContactOfUser(userId);
    }
    // now we can see in implementation that the contacts are shown
    // we want the contacts shown here in the contact field of user
    // so internally the user service establish connection from  the contact service
    // and then shows all the data over there including contacts
    // so for that we use rest template
    // to call rest template w have to declare rest template as a bean
}
