public class Student extends Person {

    /**
     * Constructor
     * @param lastname
     * @param firstname
     */
    public Student(String lastname, String firstname) {
        setLastname(lastname);
        setFirstname(firstname);
    }

    /**
     * replace the parent's method getFullName
     * @return a string + the firstname
     */
    public String getFullName() {
        return "Salut " + getFirstname();
    }
}
