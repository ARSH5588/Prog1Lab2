import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class AreaOfRectangle {

    public static void main(String[] args) {
        // Prints "Area of Rectangle" to the terminal window.
        System.out.println("\n");

        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "CA"));
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

        String jet = nf.format(area);
        System.out.println("\tArea of Rectangle = " + jet);

        String jit = nf.format(perimeter);
        System.out.println("\tPerimeter of Rectangle = " + jit);

            }

}
