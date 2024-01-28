// print the sum of First n natural number 

// package _04_Loops;

// import java.util.Scanner;

// public class LoopsProblem {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter number :");
//     int num = sc.nextInt();

//     int sum = 0;

//     for (int i = 0; i <= num; i++) {
//       sum = sum + i;
//     }
//     System.out.println(sum);
//   }
// }

// Homework Problems :  Print all even numbers till n.

// package _04_Loops;

// import java.util.Scanner;

// public class LoopsProblem {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter number :");
//     int num = sc.nextInt();

//     for (int i = 0; i <= num; i++) {
//       if (i % 2 == 0) {
//         System.out.println(i);
//       }
//     }
//   }
// }

/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
 */

package _04_Loops;

import java.util.Scanner;

public class LoopsProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, marks;

    do {
      System.out.println("enter marks out of 100 :");
      marks = sc.nextInt();

      if (marks >= 90) {
        System.out.println("This is Good");
      } else if (marks <= 89 || marks >= 60) {
        System.out.println("This is also Good");
      }

      else if (marks <= 59 || marks >= 0) {
        System.out.println("This is Good as well \t Because marks don’t matter but our effort does.");
      }

      System.out.println("you can enter 1 or 0 ");
      num = sc.nextInt();
    } while (num != 0);

  }
}
