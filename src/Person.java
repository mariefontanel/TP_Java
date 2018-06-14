public class Person {

    private String lastname;
    private String firstname;

    /**
     * set the lastname
     * @param sLastname
     */
    public void setLastname(String sLastname) {
       lastname = sLastname;
    }

    /**
     *
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * set the firstname
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     *
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     *
     * @return the full name
     */
    public String getFullName() {
        return "Bonjour " + lastname + " " + firstname;
    }

    /**
     *
     * @return a string + the firstname
     */
    public String toString() {
        return "Et alors ? " + getFirstname();
    }

}
