public class Student extends Person {

    public Student(String lastname, String firstname) {
        setLastname(lastname);
        setFirstname(firstname);
    }
    public String getFullName() {
        return "Salut " + getFirstname();
    }
}
