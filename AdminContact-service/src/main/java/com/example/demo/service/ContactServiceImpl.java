package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {
	
	
@Autowired
private ContactRepository contactrepository;


public Contact addContact (Contact contact) {
	return contactrepository.save(contact);
}

public List<Contact> getContact() {
	List<Contact> contact = contactrepository.findAll();
	System.out.println("Getting data from DB : " + contact);
	return contact;
}

public Optional<Contact> getContactbyId(String id) {
	return contactrepository.findById(id);
}

public void deleteContact(Contact contact) {
	contactrepository.delete(contact);
}

@Override
public void save(Contact contact) {

}

@Override
public List<Contact> findAll() {
	List<Contact> contact = contactrepository.findAll();
	System.out.println("Getting data from DB : " + contact);
	return contact;
}

@Override
public Optional<Contact> findById(String id) {
	return contactrepository.findById(id);
	
}


@Override
public void deleteById(String id) {
	
}


}