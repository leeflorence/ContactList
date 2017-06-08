import java.io.*;

/**
 * In memory representation of a contact of an individual, which contains
 * his/her lastName name, lastName name, street address, email address, phone
 * number and notes of an individual.
 */

public class Contact { // To do: implements Comparable <Contact>
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String email;
    private String phone;
    private String notes;

    /**
     * Constructor for Contact.
     */
    public Contact(String firstName, String lastName, String streetAddress, 
                   String email, String phone, String notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.email = email;
        this.phone = phone;
        this.notes = notes;
    }

    /**
     * Creates an individual Contact
     */
    public String toString() {
        return "";
    }
}
