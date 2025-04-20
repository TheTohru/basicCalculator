import java.util.Scanner;
//Please check README.md before using codes!
public class addition {
    public void Addition() {
        try {
            System.out.println("addition selected, please give number one and number two:");
            Scanner scanner = new Scanner(System.in);
            System.out.print("give a number: ");
            int s1 = scanner.nextInt();
            System.out.print("give a number: ");
            int s2 = scanner.nextInt();

            int result = s1 + s2;
            System.out.println("result: " + result);
            System.out.println("two entered numbers: " + s1 + " and " + s2);
            System.out.println("addition completed.");

            System.out.println("do you want to try again? (y/n)");
            String choice = scanner.next();
            if (choice.equals("y")) {
                addition A = new addition();
                A.Addition();
            } else if (choice.equals("n")) {
                System.out.println("calculator shuts down");
            } else {
                System.out.println("wrong cohice");
            }
        }
        catch(Exception e) {

            System.out.println("error: " + e.getMessage());
        }

    }
}
