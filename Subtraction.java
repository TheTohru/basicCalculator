import java.util.Scanner;

public class Subtraction {
    public void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Subtraction selected, please give number one and number two:");
        try {

            System.out.print("give a number: ");
            int one = scanner.nextInt();
            System.out.print("give a number: ");
            int two = scanner.nextInt();

            int result = one - two;

            System.out.println("result: " + result);
            System.out.println("two entered numbers: " + one + " and " + two);

            System.out.println("do you want to try again? (y/n)");
            String choice = scanner.next();
            if (choice.equals("y")) {
                Subtraction s = new Subtraction();
                s.subtraction();
            } else if (choice.equals("n")) {
                System.out.println("calculator shuts down");
            } else {
                System.out.println("wrong cohice");
            }
        }
        catch (Exception e){
            System.out.println("error: " + e.getMessage());
        }


    }

}
