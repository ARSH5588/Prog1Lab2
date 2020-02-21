import java.util.Scanner;

public class Temperature {

  public static void main(String[] args) {

    double temp_1, temp_2, temp_3, average;

    Scanner arsh = new Scanner(System.in);

    System.out.println("\n\t~ Enter the first temperature in Celsius in the past 3 days ~ ");
    temp_1 =  arsh.nextDouble();

    System.out.println("\n\t~ Enter the second temperature in Celsius in the past 3 days ~ ");
    temp_2 = arsh.nextDouble();

    System.out.println("\n\t~ Enter the third temperature in Celsius in the past 3 days ~ ");
    temp_3 = arsh.nextDouble();

    average = (temp_1 + temp_2 + temp_3) / 3;

    //%.2f is a tool to round to the nearest second decimal point
    System.out.printf("Average is of the temperatures = %.2f  ", average);
  }

}
