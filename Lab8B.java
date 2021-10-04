import java.util.Scanner;

public class Lab8B {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] array1 = new int[5], array2 = new int[5];

    System.out.println("Please enter 5 integers for the first array:");

    for (int i = 0; i < 5; i++) {
      System.out.print("Integer " + (i + 1) + ": ");
      array1[i] = sc.nextInt();
    }

    System.out.println("\nPlease enter 5 integers for the second array:");

    for (int i = 0; i < 5; i++) {
      System.out.print("Integer " + (i + 1) + ": ");
      array2[i] = sc.nextInt();
    }

    System.out.print("\nThe resulting sums are " + (array1[0] + array2[0]) + "|" + (array1[1] + array2[1]) + "|" + (array1[2] + array2[2]) + "|" + (array1[3] + array2[3]) + "|" + (array1[4] + array2[4]) + "|");
  }
}