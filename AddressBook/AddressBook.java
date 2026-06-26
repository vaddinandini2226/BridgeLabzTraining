package oopspractice;

import java.util.Scanner;

//import java.util.ArrayList;

public class AddressBook {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ContactService c=new ContactService(); 

        while (true) {

            System.out.println("====ADDRESS BOOK =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                	c.addContact();
                    break;

                case 2:
                    System.out.print("Enter First Name to Edit: ");
                    String editfName = sc.nextLine();
                    String editlName = sc.nextLine();

                    c.editContact(editfName, editlName);
                    break;

                case 3:
                    System.out.print("Enter First Name to Delete: ");
                    String deletefName = sc.nextLine();
                    String deletelName = sc.nextLine();
                   
                    c.deleteContact(deletefName, deletelName);
                    break;

                case 4:
                    
                	c.display();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }

	}

}
