import java.util.Scanner;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre nom ? "); // ask question in the terminal
        String inputLastname = scanner.next();

        System.out.println("Quel est votre prénom ? "); // ask question in the terminal
        String inputFirstname = scanner.next();

        System.out.println("Quel est votre chiffre favori ? "); // ask question in the terminal
        int inputInteger = scanner.nextInt(); // record integer

        System.out.println("Votre chiffre favori est : " + inputInteger); // display the value of the input
        scanner.close();


        Person p = new Person(); //create a new object Person and put it into the variable p
        p.setLastname(inputLastname); // set the lastname
        p.setFirstname(inputFirstname); // set the firstname
        System.out.println(p.getFullName()); // display the object p with its attributes

        Person s = new Student("Cémoi", "l'étudiant"); // create a new object Student (wich extends class Personn) with its params and put it into the variable s
        System.out.println(s.getFullName()); // display the object s with its attributes

        /*Person P = new Person();
        System.out.println(P);*/

    }

}
