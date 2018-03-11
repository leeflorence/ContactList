package Task4Final;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * The program provides a list of options for the user. Reads the user input and
 * prints the result.
 */
public class UI {

    public static void run() {
        /**
         * Constructs a new ContactList object.(PF)
         */
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);

        /**
         * Reads the Contact objects back in from the file. If the file is not
         * found, the contact list will be empty. 
         */
        contactList.loadContactsFromFile();

        /**
         * Reads the user's choice and prints the result immediately.(YL)
         */
        boolean done = false;
        while (!done) {
            System.out.println("Would you like to: \n" 
                    + "[1] Create Contact \n" + "[2] Print Contacts \n"
                    + "[3] Search Contacts \n" + "[4] Exit The Program \n");
            int option;
            // Prompts user if the input is not within the int option.
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                option = -1; // All invalid entry will be directed to case default
            }
            switch (option) {
            // Constructs a new Contact object and adds to the ContactList.
            case 1: {
                contactList.addContact();
                break;
            }
            // Prints the entire contact list.
            case 2: {
                System.out.println(contactList);
                break;
            }
            // Returns all contacts containing the same last name as user input.
            case 3: {
                System.out.println(contactList.searchByLastName());
                break;
            }
            // Writes the data to the file containing all contacts.
            case 4: {
                contactList.saveToFile();
                done = true;
                break;
            }
            default: {
                System.out.println("*** Invalid entry. Please enter again! *** \n");
                break;
            }
            }
        }
    }
}
