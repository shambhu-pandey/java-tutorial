// check age 

// package _03_If_else;

// import java.util.Scanner;

// public class Condition {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter age : ");

//     int age = sc.nextInt();

//     if (age >= 18) {
//       System.out.println("Adult");
//     } else {
//       System.out.println("not adult");
//     }
//   }
// }

// odd and even  if - else 

// package _03_If_else;

// import java.util.Scanner;

// public class Condition {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter number : ");
//     int num = sc.nextInt();

//     if (num % 2 == 0) {
//       System.out.println("Even");
//     } else {
//       System.out.println("Odd");
//     }

//   }
// }

// else - if 

// package _03_If_else;

// import java.util.Scanner;

// public class Condition {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter num1 : ");
//     int num1 = sc.nextInt();

//     System.out.println("enter num2 : ");
//     int num2 = sc.nextInt();

//     if (num1 == num2) {
//       System.out.println("Equal");
//     } else if (num1 > num2) {
//       System.out.println("Num1 is greater");
//     } else {
//       System.out.println("num2 is greater");
//     }

//   }
// }

//switch    using button show message 

package _03_If_else;

import java.util.Scanner;

public class Condition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter button : ");

    int button = sc.nextInt();

    switch (button) {
      case 1:
        System.out.println("button 1 ");
        break;

      case 2:
        System.out.println("button 2 ");
        break;
      case 3:
        System.out.println("button 3 ");
        break;
      case 4:
        System.out.println("button 4 ");
        break;
      case 5:
        System.out.println("button 5 ");
        break;

      default:
        System.out.println("invalid button");
        break;
    }

  }
}
