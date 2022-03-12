import java.util.Locale;
/*
Display format:
Surname: XXXXX
Name: YYYYY
Surname and Name: XXXXX YYYYY
Initials: XY
Login: XXyyy

 */
public class Person {
    public static void main(String[] args) {
        String name = args[0];
        String surname = args[1];
        System.out.println("Nazwisko: "
                + surname.toUpperCase().substring(0,1)+surname.toLowerCase().substring(1,surname.length()));
        System.out.println("Imię: "
                + name.toUpperCase().substring(0,1)+name.toLowerCase().substring(1,name.length()));
        System.out.println("Nazwisko i imię: " + surname.toUpperCase() + " "
                + name.toUpperCase().substring(0,1)+name.toLowerCase().substring(1, name.length()));
        System.out.println("Iniciały: " + Character.toUpperCase(name.charAt(0))
                + Character.toUpperCase(surname.charAt(0)));
        System.out.println("Login: " + surname.toUpperCase().substring(0,2)+name.toLowerCase().substring(0,3));
    }
}
