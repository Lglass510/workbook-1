import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner eyes = new Scanner(System.in);
        System.out.println("What is your name");
        String name = eyes.nextLine();

        System.out.println("Enter total hours worked");
        double totalHours = eyes.nextDouble();

        System.out.println("Enter your pay rate");
        double payRate = eyes.nextDouble();

        System.out.println(name  + totalHours * payRate);

    }
}
