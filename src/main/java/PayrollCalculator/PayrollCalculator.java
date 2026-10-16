package PayrollCalculator;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asking for there first name
        System.out.println("Enter first name");
        String firstname = scanner.nextLine();

        //asking for there last name
        System.out.println("Enter last name");
        String lastname = scanner.nextLine();

        //asking for pay rate
        System.out.println("Enter your pay rate");
        String payrate = scanner.nextLine();


    }
}
