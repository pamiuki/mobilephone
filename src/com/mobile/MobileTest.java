package com.mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact contact = new Contact("paul", "78787878");
		
		
		MobilePhone mp = new MobilePhone("12345");
		Contact contact1 = Contact.createContact("hale", "3477056131");
		
		System.out.println(mp.addNewContact(contact));
		System.out.println(mp.addNewContact(contact1));
		System.out.println(mp.updateContact(contact, new Contact("Tesoro", "47578685")));
		System.out.println(mp.addNewContact(Contact.createContact("hale", "79087")));
		System.out.println(mp.updateContact(contact1, contact));
	
		mp.printContacts();
		
		

	}

}
