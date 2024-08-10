import java.util.Scanner;

public class Cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
        System.out.println("Enter Value of a");
        int a;
        int b;
        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            }
            else {
                System.out.println("The entered value is not an integer, please enter an integer value");
                scanner.next();
            }
                        
        }
        
        System.out.println("Enter Value of b");
        while (true) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                break;
            }
            else {
                System.out.println("The entered value is not an integer, please enter an integer value");
                scanner.next();
            }
                        
        }
        
        if ( a == b) {
            System.out.println("a is equal to b");
        }
        else if (a > b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is smaller than b");
        }
        System.out.println("Do you want to check more numbers? Press Y to continue or any other key to exit.");
        choice = scanner.next();
    } while (choice.equalsIgnoreCase("Y"));
        System.out.println("Exiting the program. Goodbye!");

    }
}