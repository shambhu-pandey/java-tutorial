##  write a java code for student marks take n subject marks and on the basis of average and course marks  give grade.

```
package _10_Array;

import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("enter n :");
    int n = sc.nextInt();

    int marks[] = new int[n];

    int total = 0;
    System.out.println("enter marks of " + n + "subject");
    for (int i = 0; i < n; i++) {
      marks[i] = sc.nextInt();

    }

    for (int i = 0; i < n; i++) {
      total = total + marks[i];
    }

    double avg = total / n;
    System.out.println("Avg is :" + avg);

// subject wise grade : 

    for (int i = 0; i < n; i++) {
      System.out.print("Subject" + (i + 1) + ":");

      if (marks[i] >= 90 && marks[i] <= 100) {
        System.out.println("grade is :" + 'S');
      }

      else if (marks[i] >= 80 && marks[i] <= 89) {
        System.out.println("grade is :" + 'A');
      }

      else if (marks[i] >= 70 && marks[i] <= 79) {
        System.out.println("grade is :" + 'B');
      }

      else if (marks[i] >= 60 && marks[i] <= 69) {
        System.out.println("grade is :" + 'c');
      } else {
        System.out.println("marks is less ");
      }
    }

    System.out.print("Final GPA Grade Is : ");
    if (avg >= 90 && avg <= 100) {
      System.out.println("grade is :" + 'S');
    }

    else if (avg >= 80 && avg <= 89) {
      System.out.println("grade is :" + 'A');
    }

    else if (avg >= 70 && avg <= 79) {
      System.out.println("grade is :" + 'B');
    }

    else if (avg >= 60 && avg <= 69) {
      System.out.println("grade is :" + 'c');
    } else {
      System.out.println("FAIL");
    }

  }

}

```

## Take an array as input from user . search for a given number x and print the index at which it occurs.

```
package _10_Array;

import java.util.Scanner;

class Arrays {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("enter n :");
    int n = sc.nextInt();
    int num[] = new int[n];

    System.out.println("enter a number you want to search :");
    int choice = sc.nextInt();

    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (choice == num[i]) {
        System.out.println("index is " + i + ": " + choice + "=" + num[i]);
      } else {
        System.out.println("number is not same ");
        break;
      }
    }

  }
}
```


## Take an array of names as input from the user and print them on the screen.

```package _10_Array;

import java.util.Scanner;

class Arrays {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println(" enter no of student :");
    int n = sc.nextInt();

    String name[] = new String[n];

    System.out.println("enter name of student :");
    for (int i = 0; i < n; i++) {
      name[i] = sc.next();
    }

    for (int i = 0; i < n; i++) {
      System.out.println("Student " + (i + 1) + " is :" + name[i]);
    }

  }
}
```


## Find the maximum & minimum number in an array of integers. 


```
package _10_Array;

import java.util.Scanner;

class Arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter n :");
    int n = sc.nextInt();

    int num[] = new int[n];

    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      if (num[i] < min) {
        min = num[i];
      }
      if (num[i] > max) {
        max = num[i];
      }
    }

    System.out.println(" min number is : " + min);
    System.out.println("max  number is : " + max);
  }
}

```


## // Take an array of numbers as input and check if it is an array sorted in ascending order.  Eg : { 1, 2, 4, 7 } is sorted in ascending order.  {3, 4, 6, 2} is not sorted in ascending order.

```
package _10_Array;

import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter n :");
    int n = sc.nextInt();

    int num[] = new int[n];

    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();
    }

    boolean isAscending = true;

    for (int i = 0; i < n - 1; i++) {
      if (num[i] > num[i + 1]) { // This is the condition for descending order

        isAscending = false;
        break;
      }
    }

    if (isAscending) {
      System.out.println("The array is sorted in ascending order");
    } else {
      System.out.println("The array is not sorted in ascending order ");
    }
  }
}

```