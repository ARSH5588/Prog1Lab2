import java.util.*;

public class BMI_Calculator {

  public static void main(String[] args) {

    double bmi, pounds, feet, kilograms, meters;

    Scanner arsh = new Scanner(System.in);

    System.out.println("Please enter your weight in pounds : ");
    pounds = arsh.nextDouble();

    System.out.println("Please enter your height in feet : ");
    feet = arsh.nextDouble();

    //Convertion of uints
    meters = 0.3048 * feet;
    kilograms = 0.45359237 * pounds;

    //Formula for BMI
    bmi = kilograms / meters * meters;

    System.out.print("BMI Result " + bmi);
  }

}
