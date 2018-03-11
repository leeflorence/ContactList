package Task4Final;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * One object of class ContactList stores the whole list of Contacts.
 */

class ContactList {
    /**
     * Defines all instance variables.(PF)
     */
    private ArrayList<Contact> contacts;
    private Scanner scanner;

    /**
     * Default constructor.(PF)
     */
    public ContactList() {
        contacts = new ArrayList<Contact>();
        scanner = new Scanner(System.in);
    }

    /**
     * Add a new Contact object to the ContactList.(VM)
     */
    public void addContact() {
        Contact contact = readEntry();
        contacts.add(contact);
    }

    /**
     * Gets user input and stores in a new Contact object.(YL)
     */
    public Contact readEntry() {
        String firstName, lastName, streetAddress, email, phone, notes;
        System.out.print("Please enter the following information:" 
                         + "\nLast Name (required): ");
        lastName = scanner.nextLine().trim();
        if (lastName.isEmpty()) {
            System.out.println("\n*** Last name is required! ***\n");
            return readEntry();  
        } else {
            System.out.print("First Name: ");
            firstName = scanner.nextLine();
            System.out.print("Address: ");
            streetAddress = scanner.nextLine();
            System.out.print("Email: ");
            email = scanner.nextLine();
            System.out.print("Phone Number: ");
            phone = scanner.nextLine();
            System.out.print("Notes: ");
            notes = scanner.nextLine();
            // Constructs a Contact object to store the user input.
            Contact newContact = new Contact(firstName, lastName, 
                                             streetAddress, email, phone, notes);
            System.out.println("=== Contact Saved! ===\n");
            return newContact;
        }
    }

    /**
     * Prints the entire ContactList. Sorted by last name, then first name. The
     * sorting is case insensitive.(YL,VM)
     */
    public String toString() {
        Collections.sort(contacts);
        String allcontacts = "";
        for (int i = 0; i < contacts.size(); i++) {
            allcontacts += contacts.get(i);
        }
        return "=== There are " + contacts.size() + " contacts in the Contact List ===\n\n" 
               + allcontacts
               + "\n";
    }

    /**
     * Returns a String of contacts containing the same last name as user input
     * in ascending order and tells the user the number of contacts found. The
     * search is case insensitive.(PF,YL)
     */
    public String searchByLastName() {
        Collections.sort(contacts);
        System.out.print("Please enter the last name: ");
        String lastName = scanner.nextLine();
        String matchingLastname = "";
        int occurrences = 0;
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (lastName.equalsIgnoreCase(contact.getLastName())) {
                matchingLastname += contact + "\n";
                occurrences++;
            }
        }
        if (occurrences == 0) {
            return "*** No Contacts with that last name where found. *** \n";
        } else {
            return "=== " + occurrences + " Contacts Found! ===\n\n" 
                    + matchingLastname;
        }
    }

    /**
     * Reads the Contact objects back in from the file. If the file is not
     * found, the contact list will be empty.(YL) 
     */
    public void loadContactsFromFile() {
        try {
            FileInputStream loadFile = new FileInputStream("ContactManager.dat");
            ObjectInputStream loadObject = new ObjectInputStream(loadFile);
            contacts = (ArrayList<Contact>) loadObject.readObject();
            System.out.println("\nContact Manager Data: Loaded");
            loadFile.close();
            loadObject.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\nContact Manager Data: File not found.");
        }
        System.out.println();
    }

    /**
     * Writes the Contact objects to the file containing all of the current
     * contacts.(YL) 
     */
    public void saveToFile() {
        try {
            FileOutputStream outFile = new FileOutputStream("ContactManager.dat");
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);
            outObject.writeObject(contacts);
            outFile.close();
            outObject.close();
            System.out.println("Contact List Saved: See you next time!");
        } catch (IOException e) {
            System.err.println("Error saving the contact to the list!");
        }
    }
}
