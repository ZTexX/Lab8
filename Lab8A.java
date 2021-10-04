import java.util.Scanner;

public class Lab8A {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] integers = new int[10];
    int sum = 0;

    System.out.println("Please enter 10 integers:");

    for (int i = 0; i < integers.length; i++) {
      System.out.print("Integer " + (i + 1) + ": ");
      integers[i] = sc.nextInt();
    }

    for (int i = 0; i < integers.length; i++) {
      sum += integers[i];
    }

    System.out.println("The sum is " + sum);
  }
}