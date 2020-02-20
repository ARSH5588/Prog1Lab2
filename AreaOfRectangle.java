import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        // Prints "Area of Rectangle" to the terminal window.
        System.out.println("\n");

        Scanner arsh = new Scanner(System.in);

        double area, perimeter, length, width;

        System.out.println("\n\t* ~ Area of Rectangle ~ *");

        System.out.println("\n\tEnter length of the rectangle");
        length = arsh.nextDouble();

        System.out.println("\n\tEnter the width of the rectangle");
        width = arsh.nextDouble();

        area = length*width;
        perimeter = 2*(length + width);

        System.out.println("\n\t\t* ~ ANSWER ~ * ");

        System.out.println("\tArea of Rectangle = " + area);
        System.out.println("\tPerimeter of Rectangle = " + perimeter);

            }

}
