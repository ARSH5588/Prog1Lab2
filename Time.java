import java.util.*;

public class Time {

  public static void main(String[] args) {

    int minutes, seconds, secs;

    Scanner arsh = new Scanner(System.in);

    System.out.println("\n\t* Enter the amount of seconds *");
    secs = arsh.nextInt();

    minutes = secs / 60;
    seconds = secs % 60;

    System.out.println("\n\t- Time - " + minutes + ":" + seconds);

  }

}
