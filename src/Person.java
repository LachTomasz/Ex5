import java.util.Locale;
import java.lang.Character;

public class Person {
    public static void main(String[] args) {
        String name = args[0];
        String surname = args[1];
        System.out.println("Nazwisko: " + Character.toUpperCase(surname.charAt(0))+surname.substring(1));
        System.out.println("Imię: " + Character.toUpperCase(name.charAt(0))+name.substring(1));
        System.out.println("Nazwisko i imię: " + surname.toUpperCase() + " " + Character.toUpperCase(name.charAt(0))+name.substring(1));
        System.out.println("Iniciały: " + Character.toUpperCase(name.charAt(0))
                + Character.toUpperCase(surname.charAt(0)));
        System.out.println("Login: " + surname.toUpperCase().substring(0,2)+name.substring(0,3));
    }
}
