package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Contact;

public interface ContactService {
	public Contact addContact (Contact contact);
	public List<Contact> getContact() ;
	public Optional<Contact> getContactbyId(String id);
	public void  deleteContact(Contact contact);
	public void save(Contact contact);
	public List<Contact> findAll();
	public Optional<Contact> findById(String id);
	public void deleteById(String id);
}
