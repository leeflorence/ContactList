
/**
 * One object of class ContactList represents an individual's contact information,
 * which includes his/her first name, last name, street address, email address, 
 * phone number and notes.  
 */
import java.util.ArrayList; 
import java.util.Scanner;
import java.io.*; // objects can be read back from the file into the variables in memory

public class ContactList {
    private ArrayList<Contact> contacts;
    private Scanner scanner;

    /**
     * Constructor that allocates space for the list.
     */
    public ContactList() {
        scanner = new Scanner(System.in);
    }

    /**
     * (UseCase1) Creates a new Contact object and adds it to the list, if there is room.
     */
    public void addContact(String first, String last, String streetAddress, String email,
                           String phone, String notes) {
        // Write the object to the file

    }

    /**
     * (UseCase2) Returns a Stirng containing all the data in the list.
     */
    public String toString() {
        return null;
    }
    
    /**
     * (UseCase3) Retrieves a person's information by last name. 
     */
    public String byLastName() {
        return null;
     // Read the objects back in from the file
    }
    
    /**
     * (UseCase4) Automatically save the contact list to the file when the user presses the JButton "QUIT". 
     */
    public void saveToDisk() {
    }
    

}
