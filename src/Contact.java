package Task4Final;

import java.io.Serializable;

/**
 * In memory representation of a contact of an individual, which contains the
 * individual's first name, last name, street address, email, phone number and
 * notes.
 */

public class Contact implements Comparable<Contact>, Serializable {
    /**
     * Defines all instance variables private.
     */
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String email;
    private String phone;
    private String notes;

    /**
     * Generates Serial version Id.
     */
    public static final long serialVersionUID = 42L;

    /**
     * Default Constructor for Contact.
     */
    public Contact() {
    }

    /**
     * Constructor for Contact with only one parameter lastName.
     */
    public Contact(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Parameterized Constructor for Contact with all parameters.
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

    // Return the first name of this contact.
    public String getFirstName() {
        return firstName;
    }

    // Returns the last name of this contact.
    public String getLastName() {
        return lastName;
    }

    // Returns the street address of this contact.
    public String getStreetAddress() {
        return streetAddress;
    }

    // Returns the email of this contact.
    public String getEmail() {
        return email;
    }

    // Returns the phone number of this contact.
    public String getPhone() {
        return phone;
    }

    // Returns the notes of this contact.
    public String getNotes() {
        return notes;
    }

    /**
     * Return a String representation of this contact.
     */
    public String toString() { 
        return "Name:            " + lastName + ", " + firstName + "\n"
               + "Address:         " + streetAddress + "\n"
               + "Email:           " + email + "\n" 
               + "Phone Number:    " + phone + "\n"
               + "Notes:           " + notes + "\n" 
               + "++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n";            
    }

    /**
     * Compares the last names of two contacts for order. If their last names
     * are equal, their first names are used for comparison. Otherwise, their
     * last names are used.
     * 
     * Returns a negative integer, zero, or a positive integer as this contact
     * is less than, equal to, or greater than the other contact.
     */
    public int compareTo(Contact other) {
        int result = lastName.compareToIgnoreCase(other.lastName);
        if (result == 0) {
            return firstName.compareToIgnoreCase(other.firstName);
        } else {
            return result;
        }
    }
}
