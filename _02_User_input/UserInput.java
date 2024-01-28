package _02_User_input;

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number :");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int sum = num1 + num2;
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(sum);
  }
}
