import java.util.Scanner;

public class FharenheitToCelsius {
  public static void main(String[] args) {
    float temperature;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter temperature in Fahrenheit");
    temperature = in.nextFloat();

    temperature = ((temperature - 32) * 5) / 9;

    System.out.println("temperature in Celsius = " + temperature);
  }
}
