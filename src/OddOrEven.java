import java.util.Scanner;

public class OddOrEven {
//  public static void main(String args[])
//  {
//    int x;
//    System.out.println("Enter an integer to check if it is odd or even");
//    Scanner in = new Scanner(System.in);
//    x = in.nextInt();
//
//    if (x % 2 == 0)
//      System.out.println("The number is even.");
//    else
//      System.out.println("The number is odd.");
//  }

  public static void main(String[] args) {
    int c;
    System.out.println("Input an integer");
    Scanner in = new Scanner(System.in);
    c = in.nextInt();

    if ((c / 2) * 2 == c)
      System.out.println("Even");
    else
      System.out.println("Odd");
  }
}
