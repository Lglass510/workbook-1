import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");

        Scanner myScanner = new Scanner(System.in);


        String firstNumberString = myScanner.nextLine();
        System.out.println("Heres the number you entered: " + firstNumberString);
        int firstNumber = Integer.parseInt(firstNumberString);


        System.out.println("Enter the second number: ");
        String secondNumberString = myScanner.nextLine();
        int secondNumber = Integer.parseInt(secondNumberString);

        System.out.println("Possible calculations: ");

        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println("Please select an option: ");
        String operation = myScanner.nextLine();
        if (operation.equals("M")) {
            int result = firstNumber * secondNumber;
            System.out.println("The result is:" + result);
        }

    }

}
