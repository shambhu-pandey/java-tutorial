/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

*/

// package _03_If_else;

// import java.util.Scanner;

// public class Task {
//   public static void main(String[] args) {
//     System.out.println("enter number 1  ");
//     Scanner sc = new Scanner(System.in);
//     float a = sc.nextFloat();

//     System.out.println("enter Character  ");
//     char c = sc.next().charAt(0);

//     System.out.println("enter number 2  ");
//     float b = sc.nextFloat();

//     switch (c) {
//       case '-':
//         float sub = a - b;
//         System.out.println(sub);
//         break;

//       case '+':
//         float Add = a + b;
//         System.out.println(Add);
//         break;

//       case '*':
//         float mul = a * b;
//         System.out.println(mul);
//         break;

//       case '/':
//         float divide = a / b;
//         System.out.println(divide);
//         break;

//     }

//   }
// }

//Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

package _03_If_else;

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    System.out.println("enter  no of month :  ");
    Scanner sc = new Scanner(System.in);

    int month = sc.nextInt();

    switch (month) {
      case 1:
        System.out.println("january");
        break;

      case 2:
        System.out.println("feb");
        break;
      case 3:
        System.out.println("march");
        break;
      case 4:
        System.out.println("april");
        break;
      case 5:
        System.out.println("may");
        break;
      case 6:
        System.out.println("june");
        break;
      case 7:
        System.out.println("july");
        break;
      case 8:
        System.out.println("august");
        break;
      case 9:
        System.out.println("sep");
        break;
      case 10:
        System.out.println("oct");
        break;
      case 11:
        System.out.println("nov");
        break;
      case 12:
        System.out.println("dec");
        break;

      default:
        System.out.println("invalid month :");
        break;

    }

  }
}
