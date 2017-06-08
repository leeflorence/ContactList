import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * Test class ContactList by calling all methods on a ContactList object.
 */

public class Main {
    public static void main(String[] args) {

        /* Constructs an object for class ContactList */
        ContactList contactList;
        contactList = new ContactList();

        /* Ask the user to select one of the four options */
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("PLEASE SELECT \n" 
                               + "1: CREATE A NEW CONTACT \n" 
                               + "2: PRINT CONTACTS \n"
                               + "3: SEARCH CONTACTS \n" 
                               + "4: EXIT THE PROGRAM \n");

            int option = scanner.nextInt();
            switch (option) {
            case 1: {
                contactList.addContact(); // add new person into contact list
                System.out.println("The new contact has been created and saved to the contact list \n");
                break;
            }
            case 2: {
                System.out.println("Here is the entire contact list: \n" + contactList + "\n");
                // call the toString() method implicitly

                break;
            }
            case 3: {
                System.out.println("Here is the contact information for the entered last name: \n"
                        + contactList.searchByLastName(""));
                break;
            }
            case 4: {
                System.out.println("" + "Quit and save to the contact list \n");
                contactList.saveToFile();
                done = true;
                break;
            }
            default: {
                System.out.println("Invalid option \n");
                break;
            }
            }
        }
    }
}

/* OUTPUT 
 PLEASE SELECT 
1: CREATE A NEW CONTACT 
2: PRINT CONTACTS 
3: SEARCH CONTACTS 
4: EXIT THE PROGRAM 

1
The new contact has been created and saved to the contact list 

PLEASE SELECT 
1: CREATE A NEW CONTACT 
2: PRINT CONTACTS 
3: SEARCH CONTACTS 
4: EXIT THE PROGRAM 

2
Here is the entire contact list: 


PLEASE SELECT 
1: CREATE A NEW CONTACT 
2: PRINT CONTACTS 
3: SEARCH CONTACTS 
4: EXIT THE PROGRAM 

3
Here is the contact information for the entered last name: 

PLEASE SELECT 
1: CREATE A NEW CONTACT 
2: PRINT CONTACTS 
3: SEARCH CONTACTS 
4: EXIT THE PROGRAM 

5
Invalid option 

PLEASE SELECT 
1: CREATE A NEW CONTACT 
2: PRINT CONTACTS 
3: SEARCH CONTACTS 
4: EXIT THE PROGRAM 

4
Quit and save to the contact list 

 */

