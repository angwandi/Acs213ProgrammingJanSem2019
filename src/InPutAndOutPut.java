import java.util.Scanner;

public class InPutAndOutPut {
  static void print(String string) {
    System.out.println(string);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    print("Enter a string : ");
    String line = scanner.nextLine();
    print("You have entered " + line);
    print("Enter a int : ");
    print("You have entered " + scanner.nextInt());
    print("Enter a float : ");
    print("You have entered " + scanner.nextFloat());
  }

}
