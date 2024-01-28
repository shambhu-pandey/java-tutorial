/*Homework Problems
 1. Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.

 2.Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

 3. Make a program that prints the table of a number that is input by the user. 
(HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)
 */

// solution for 1 and 2 

// package _02_User_input;

// import java.util.Scanner;

// public class Task {
//   public static void main(String[] args) {

//     int age = 18;
//     System.out.println("your age is : " + age);

//     Scanner sc = new Scanner(System.in);
//     float radius = sc.nextFloat();
//     double area = 3.14 * (radius * radius);

//     System.out.println(area);

//   } 
// }

// solution for 3 

package _02_User_input;

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter number : ");
    int num = sc.nextInt();
    System.out.println(num);

    for (int i = 1; i <= 10; i++) {
      System.out.println(num + "*" + i + "=" + num * i);
    }

    // print table up to 20 -
    int i, j;

    for (i = 1; i <= 10; i++) {
      for (j = 1; j <= 20; j++) {
        System.out.println(i * j);
      }
    }

  }
}