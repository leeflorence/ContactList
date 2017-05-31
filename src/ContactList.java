
/**
 * One object of class ContactList represents an individual's contact information,
 * which includes his/her first name, last name, street address, email address, 
 * phone number and notes.  
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ContactList implements Serializable {
    private ArrayList<Contact> contacts;
    private Scanner scanner;

    /**
     * Constructor that allocates space for the list.
     */
    public ContactList() {
        scanner = new Scanner(System.in);
    }

    /**
     * Creates a new Contact object and adds it to the list. If the user leaves
     * the last name blank, the user will not be entered into the contact list.
     */
    public void addContact(String first, String last, String streetAddress, 
                           String email, String phone, String notes) {
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
     * all contacts with same last name will be displayed.
     */
    public String byLastName() {
        return "";
    }

    /**
     * Saves to a data file on the disk containing all of the current contacts
     * when the user quits the program.
     */
    public void saveToDisk() {
    }

    /**
     * Starts the contact list program and opens existing data file on disk. The
     * system begins with an empty contact list if there is no data file on
     * disk.
     */
    public void openFileOnDisk() {
    }
}
