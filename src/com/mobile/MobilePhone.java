package com.mobile;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone {
	private String myNumber; //This is the phone number of the phone owner
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>();
	}
	//Add a new contact if it doesn't exist already and return a boolean
	public boolean addNewContact(Contact contact) {
		
		if(!findContact(contact)) {
			myContacts.add(contact);
			return true;
		}
		return false;
	}
	//this method update a contact if the old contact exist
	public boolean updateContact(Contact oldContact, Contact newContact) {
		
		if(findContact(oldContact)) {
		
			myContacts.set(this.myContacts.indexOf(oldContact), newContact);
			return true;
		}
		return false;
	}
	//This method removes a ocntact if it exist 
	public boolean removeContact(Contact contact) {
		
		if(findContact(contact)) {
			myContacts.remove(this.myContacts.indexOf(contact));
			return true;
		}
		return false;
	}
	//The private methods are used to check if a contact exist in the phonebook 
	//It is maked porivate because it is not used outside this class
	//the second overloaded method is used to check the existence of a contact if either the name or phone number is  passed as argument.
	private boolean findContact(Contact contact) {
		
		return myContacts.indexOf(contact) >= 0;
	}
	
	private boolean findContact(String contact) {
		for(int i = 0; i<myContacts.size(); i++) {
			
			if(myContacts.get(i).getName().equals(contact) || myContacts.get(i).getPhoneNumber().equals(contact) ) return true;
			
		}
		return false;
	}
	//This method searches and return a contact if it is found.
	public Contact queryContact(String name) {
	
		if(findContact(name)) {
			
			for(Contact contact : myContacts) {
				if(contact.getName().equals(name)) return contact;
			}
		}
		return null;
		
	}
	//This method prints the contact list
	public void printContacts() {
		for(int i = 0; i < myContacts.size(); i++) {
			System.out.println((i+1) + ". " +
					myContacts.get(i).getName() + " -> " +
					myContacts.get(i).getPhoneNumber());
		
		}
		
	}
}
