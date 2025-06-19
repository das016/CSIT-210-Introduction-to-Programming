package comProj;

public class Contact {
    //Attributes of the Contact Object.
    private  String firstName;
    private String lastName;
    private int zip;

    // This is the Constructor.
    public Contact (String firstName, String lastName, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zip = zip;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
        
    public int getZip() {
        return zip;
    }
       
    //toString method for printing.
    @Override
    public String toString() {
        return "First: " + firstName + ", Last: " + lastName + ", ZIP: " + zip;
    }
}

