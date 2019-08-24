package JonatanVuong;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Kalkylator {

    public static double Addition(double num1, double num2){
        return num1 + num2;
    }
    public static double Subtraktion(double num1, double num2){
        return num1 - num2;
    }
    public static double Multiplikation(double num1, double num2){
        return num1 * num2;
    }
    public static double Division(double num1, double num2){
        return num1 / num2;
    }

     static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        boolean Life = true;
        double första, andra, resultat;

        while(Life){


        System.out.println("Skriv in det första talet");
        första = Double.parseDouble((scanner.nextLine()));
        System.out.println("Välj matte metod");
        String Val = scanner.nextLine();
        System.out.println("Skriv in det andra talet");
        andra = Double.parseDouble(scanner.nextLine());
        resultat = 0;



        switch(Val){
            case "+":
                resultat = Addition(första, andra);
                break;

            case "-":
                resultat = Subtraktion(första, andra);
                break;

            case "*":
                resultat = Multiplikation(första, andra);
                break;

            case "/":
                resultat = Division(första, andra);
                break;
            default:
                System.out.println("Inga bokstäver! Välj mellan +, -, *, /.");
        }
        System.out.println(resultat);
            System.out.println("Vill du göra mer räkningar?(Y/N)");
            String svar = scanner.nextLine();

            switch (svar){
                case "n":
                    Life = false;
                    break;
                case "N":
                    Life = false;
                    break;
                default:
                    System.out.println("Då fortsätter vi!");
            }
            }

    }

}
