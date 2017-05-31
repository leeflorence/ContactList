import java.util.ArrayList;
import java.util.Scanner; // or use java.util.* 

/**
 * Test class ContactList by calling all methods on a ContactList object.
 */

public class Main {
    public static void main(String[] args) {

        /**
         * Create the ArrayList of contacts
         */
        ArrayList<Contact> allContacts;
        allContacts = new ArrayList<Contact>();
        int num_contacts = 0; // Keep track of the number of existing contacts.

        /**
         * Ask the user to select one of the five options that includes enters a
         * new person into the contact list, prints the contact list,
         * retrieves a person's information by last name, quits the program and
         * saves to disk, or starts the program and opens existing file on
         * disk.
         */
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println(
                    "Please Enter \n1 for creating a new person into contact list, \n" 
                  + "2 for printing the contact list, \n"
                  + "3 for searching by last name, \n" + "4 for quitting, and \n" 
                  + "5 for opening the contact list file");

            int option = scanner.nextInt();
            switch (option) {
            case 1: {
                ContactList.addContact(); // add new person into contact list
                break;
            }
            case 2: {
                System.out.println(allContacts);
                // print entire contact list
                // call the toString() method implicitly
                break;
            }
            case 3: {
                System.out.println(ContactList.byLastName());
                break;
            }
            case 4: {
                ContactList.saveToDisk();
                break;
            }
            case 5: { // or default
                System.out.println(ContactList.openFileOnDisk());
                break;
            }
            }
        }
    }
}
