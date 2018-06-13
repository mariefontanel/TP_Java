public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.setLastname("Etienne");
        p.setFirstname("Paul");
        System.out.println(p.getFullName());

        Person s = new Student("Fontanel", "l'étudiante Marie");
        System.out.println(s.getFullName());
    }
}
