public class Contact {
    /*
     * Objects of this class are Contacts and it stores theor first name, last name,
     * phone number, email, and birthday date then assign an Id to each of them.
     * 
     * @param a the input from system input that is going to be value of the desired
     * attribute of class
     */
    String firstname;
    String lastname;
    String phonenum;
    String email;
    String birthdate;
    int id;

    /* Default constructor to inzialize Class attributes to a defaut value. */
    public Contact(int a) {

    }

    /*
     * The main constructor tha assign the input values to each object.
     */
    public Contact() {
        this.firstname = getFirstname();
        this.lastname = getLastname();
        this.phonenum = getPhonenumber();
        this.email = getEmail();
        this.birthdate = getBirthdate();
        this.id = getId();
    }

    /*
     * set and get methods for assigning a value to each attribute.
     */
    public void setFirstname(String a) {
        this.firstname = a;
    }

    public void setLastname(String a) {
        this.lastname = a;
    }

    public void setPhonenumber(String a) {
        this.phonenum = a;
    }

    public void setEmail(String a) {
        this.email = a.toLowerCase();
    }

    public void setBirthdate(String a) {
        this.birthdate = a;
    }

    public void setId(int a) {
        this.id = a;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhonenumber() {
        return phonenum;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    /*
     * This method prints all attributes of an object.
     */
    public void display() {
        System.out.println("####");
        System.out.println("id: " + id);
        System.out.println("first name: " + this.firstname);
        System.out.println("last name: " + this.lastname);
        System.out.println("phone number: " + this.phonenum);
        System.out.println("email: " + this.email);
        System.out.println("birthdate: " + this.birthdate);
    }

    /*
     * 2 methods to check eqaulity of an entered string with an object's email or
     * phone number.
     * used for search feature in the main cause.
     */
    public boolean checkerNum(String a) {
        return this.phonenum.equals(a);
    }

    public boolean checkerEm(String a) {
        return this.email.equals(a.toLowerCase());
    }
}
