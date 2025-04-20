import java.util.Scanner;
//Please check README.md before using codes!
public class Division {
    public void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to Division, please give number one and number two:");
        try{

        System.out.print("give a number: ");
        int one = scanner.nextInt();
        System.out.print("give a number: ");
        int two = scanner.nextInt();

        int result = one / two;
        System.out.println("result: " + result);
        System.out.println("two entered numbers: " + one + " and " + two);
        System.out.println("Division completed...");

        System.out.println("do you want to try again? (y/n)");
        String choice = scanner.next();
        if (choice.equals("y")) {
            Division d = new Division();
            d.division();
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
