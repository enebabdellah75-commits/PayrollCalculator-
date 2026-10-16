package PayrollCalculator;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asking for there first name
        System.out.println("Enter first name:");
        String firstname = scanner.nextLine();

        //asking for there last name
        System.out.println("Enter last name:");
        String lastname = scanner.nextLine();

        //asking for pay rate
        System.out.println("Enter your pay rate:");
        double payrate = scanner.nextDouble();

        //asking hour worked
        System.out.println("hours worked:");
        double houreworked= scanner.nextDouble();

        //calculate the total pay
        double totalpay=houreworked * payrate ;

        //employee's name and grosspay
        System.out.println("employee:  "  + lastname);
        System.out.println("gross pay: $  " + totalpay);


    }
}
