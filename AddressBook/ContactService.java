package oopspractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {
	

	ArrayList<Contact> contacts=new ArrayList<Contact>();
	Scanner sc=new Scanner(System.in);
	
//	 Method for adding new contact to contact book
	public void addContact()
	{
		System.out.println("Enter first Name: ");
		String fname=sc.nextLine();
		System.out.println("Enter last Name: ");
		String lname=sc.nextLine();
		System.out.println("Enter address: ");
		String address=sc.nextLine();
		System.out.println("Enter city: ");
		String city=sc.nextLine();
		System.out.println("Enter state: ");
		String state=sc.nextLine();
		System.out.println("Enter Zip:  ");
		int zip=sc.nextInt();
		System.out.println("Enter phone Number: ");
		long phonenumber=sc.nextLong();
		System.out.println("Enter email: ");
		sc.nextLine();
		String email=sc.nextLine();
//		Calling contact class constructor
		Contact cont=new Contact(fname,lname,address,city,state,zip,phonenumber,email);
		contacts.add(cont);
		System.out.println("New contact added successfully");
//		return cont;
		
	}
//	Method for updating details  of a contact 
	public void editContact(String fname,String lname)
	{
		for(Contact con:contacts)
		{
			if(con.getFirstName().equalsIgnoreCase(fname) && con.getLastName().equalsIgnoreCase(lname))
			{
				System.out.println("Enter new address: ");
				con.setAddress(sc.nextLine());
				System.out.println("Enter new city: ");
				con.setCity(sc.nextLine());
				System.out.println("Enter new state: ");
				con.setState(sc.nextLine());
				System.out.println("Enter new Zip:  ");
				con.setZip(sc.nextInt());
				System.out.println("Enter new  phone Number: ");
				con.setPhonenumber(sc.nextLong());
				System.out.println("Enter new email: ");
				sc.nextLine();
				con.setEmail(sc.nextLine());
				System.out.println("Updated successfully....");
				return;
			}
		}
		System.out.println("No such contact found");
	}
//	Method for deleting a contact
	public void deleteContact(String fname,String lname)
	{
		for(Contact con:contacts)
		{
			if(con.getFirstName().equalsIgnoreCase(fname) && con.getLastName().equalsIgnoreCase(lname))
			{
				contacts.remove(con);
				System.out.println("Contact deleted successfully....");
				return;
			}
		}
		System.out.println("Name mismatch enter correct name!");
	}
//	method for displaying contacts  present in a phonebook
	public void display()
	{
		if(contacts.isEmpty())
		{
			System.out.println("No contacts present");
			return;
		}
		for(Contact con:contacts)
		{
			System.out.println(con);
		}
//		System.out.println(contacts);
	}
	
}
