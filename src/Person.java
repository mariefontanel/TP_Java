public class Person {

    private String lastname;
    private String firstname;

    public void setLastname(String sLastname) {
       lastname = sLastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFullName() {
        return "Bonjour " + lastname + " " + firstname;
    }


}
