import java.util.Scanner;

public class Multiplication {
    public void multiplication(){
        Scanner scanner = new Scanner(System.in);
         System.out.println("welcome to Multiplication, please give number one and number two:");
         try{

         System.out.print("give a number: ");
         int one = scanner.nextInt();
         System.out.print("give a number: ");
         int two = scanner.nextInt();

         int result = one * two;
         System.out.println("result: " + result);
         System.out.println("two entered number: " + one + " and " + two);
         System.out.println("Multiplication completed...");

         System.out.println("do you want to try again? (y/n)");
         String choice = scanner.next();
         if (choice.equals("y")) {
             Multiplication m = new Multiplication();
             m.multiplication();
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
