
/**
 * One object of class ContactList represents a collection of contact information.
 * Each contact is stored in a contact object. 
 */

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ContactList {

    /* Stores all the contacts */
    private ArrayList<Contact> contacts;

    /* For reading the user's input */
    private Scanner scanner;

    /**
     * Default constructor to initialize the ArrayList of contacts. Calls
     * loadContactsFromFile() to load the contacts from file.
     */
    public ContactList() {
    }

    /**
     * Opens existing data file on disk and populates contacts with the file's
     * content. If the file is not found, the contact list will be empty.
     */
    public void loadContactsFromFile() {
    }

    /**
     * Collects information of the user's first name, last name, street address,
     * email address, phone number and notes to create a new Contact object and
     * save it to the contact list. If the user leaves the last name blank, the
     * new entry will not be entered into the contact list.
     */
    public void addContact() {
    }

    /**
     * Returns a String containing entire contact list. Sorted by last name,
     * then first name. The sorting is case Insensitive.
     */
    public String toString() {
        return "";
    }

    /**
     * Retrieves a person's information by last name. The search is case
     * INsensitive. Prompts the user if there is no such last name. Otherwise
     * returns a String containing contacts with that last name.
     */
    public String searchByLastName(String lastName) {
        return "";
    }

    /**
     * Saves to a data file on the File containing all of the current contacts
     * when the user quits the program.
     */
    public void saveToFile() {
    }
    
}
