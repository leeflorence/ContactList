import java.io.*; 

/**
 * In memory representation of a contact of an individual, which contains his/her first name, last name, 
 * street address, email address, phone number and notes of an individual. 
 */

public class Contact {
    private String first;
    private String last;
    private String streetAddress;
    private String email;
    private String phone; 
    private String notes;
    
    
    /**
     * Constructor for Contact. 
     */
    public Contact(String first, String last, String streetAddress, 
                   String email, String phone, String notes) {
        this.first = first;
        this.last = last;
        this.streetAddress = streetAddress;
        this.email = email;
        this.phone = phone;
        this.notes = notes;
    }
  
    /**
     * Returns a String that contains the contact information. 
     */
    public String toString() {
        return "";
    }
}
