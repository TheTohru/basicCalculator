import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("welcome to basic calculator, please make a choice.");
      System.out.println("addition 1, Subtraction 2, Multiplication 3, Division 4, exit 5");
      String choice = scanner.nextLine();

      switch (choice){

          case"1":
              addition a = new addition();
              a.Addition();
              break;
          case"2":
              Subtraction s = new Subtraction();
              s.subtraction();
              break;
          case"3":
              Multiplication m = new Multiplication();
              m.multiplication();
              break;
          case"4":
              Division d = new Division();
              d.division();
              break;
          case"5":
              System.out.println("sytem shuts down");
              break;
          default:
              System.out.println("wrong choice");
              break;

      }
