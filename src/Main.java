package Task4Final;

/**
 * Tests the classes ContactList and Contact by calling the class UI that will
 * ask user to select from a list of choices, which include Create Contact,
 * Print Contacts, Search Contacts and Exit The Program.
 */

public class Main {
    public static void main(String[] args) {
        /**
         * The program provides a list of options for the user. Reads the user
         * input and prints the result.
         */
        UI.run();
    }
}





/*****************************************************
 * OUTPUT
 *****************************************************
Contact Manager Data: Loaded

Would you like to: 
[1] Create Contact
[2] Print Contacts
[3] Search Contacts
[4] Exit the program

1
Please enter the following information:
Last Name (required): Maclean
First Name: Bob
Address: 15 Baker Street, Chico, CA
Email: bobmcln@zombie.com
Phone Number: 650-344-8927
Notes: His birthday is June 20. 
=== Contact Saved! === 

Would you like to: 
[1] Create Contact
[2] Print Contacts
[3] Search Contacts
[4] Exit the program

1
Please enter the following information:
Last Name (required): 
*** Last name is required ***

Would you like to: 
[1] Create Contact
[2] Print Contacts
[3] Search Contacts
[4] Exit the program

2 
=== There are 2 contacts in the Contact List ===

Name:            MACLEAN, BOB
Address:         15 BAKER STREET, CHICO, CA
Email:           bobmcln@zombie.com
Phone Number:    650-344-8927
Notes:           HIS BIRTHDAY IS JUNE 20. 
++++++++++++++++++++++++++++++++++++++++++++++++++
Name:            MACLEAN, JULIE
Address:         15 BAKER STREET, CHICO, CA
Email:           juliemcln@zombie.com
Phone Number:    650-384-8821
Notes:           PROFESSIONAL FLORIST.
++++++++++++++++++++++++++++++++++++++++++++++++++

Would you like to: 
[1] Create Contact
[2] Print Contacts
[3] Search Contacts
[4] Exit the program

3
Search by last name:  Maclean
=== 2 Contacts Found! ===

Name:            MACLEAN, BOB
Address:         15 BAKER STREET, CHICO, CA
Email:           bobmcln@zombie.com
Phone Number:    650-344-8927
Notes:           HIS BIRTHDAY IS JUNE 20. 
++++++++++++++++++++++++++++++++++++++++++++++++++
Name:            MACLEAN, JULIE
Address:         15 BAKER STREET, CHICO, CA
Email:           juliemcln@zombie.com
Phone Number:    650-384-8821
Notes:           PROFESSIONAL FLORIST.
++++++++++++++++++++++++++++++++++++++++++++++++++

Would you like to: 
[1] Create Contact
[2] Print Contacts
[3] Search Contacts
[4] Exit the program

3
Search by last name:
Maple
*** No Contacts with that last name were found. ***

Would you like to: 
[1] Create Contact
[2] Print Contacts
[3] Search Contacts
[4] Exit the program

A
*** Invalid entry. Please enter again! *** 

Would you like to: 
[1] Create Contact
[2] Print Contacts
[3] Search Contacts
[4] Exit the program

4
Contact List Saved: See you next time! 

*****************************************************/

