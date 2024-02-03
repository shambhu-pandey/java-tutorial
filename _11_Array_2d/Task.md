## Take an 2d array input  and display it .

```

import java.util.Scanner;

public class Demo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter row and column :");

    int row = sc.nextInt();
    int column = sc.nextInt();

    int number[][] = new int[row][column];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        number[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.println(" ");
    }

  }
}
```


## Take a matrix as input from the user . search for a given number x and print the indices at which it occurs.

```

import java.util.Scanner;

public class Demo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter row and column :");

    int row = sc.nextInt();
    int column = sc.nextInt();

    int number[][] = new int[row][column];

    System.out.println("enter search element :");

    int search = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        number[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (search == number[i][j]) {
          System.out.println("search element is presnt at " + (i) + ", " + (j));
          found = true;
          break;
        }

      }
      if (found) {
        break;
      }
    }
    if (!found) {
      System.out.println("search element is not present");
    }
  }

}

```



## transpose of a matrix :

```import java.util.Scanner;

public class Demo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter row and column :");

    int row = sc.nextInt();
    int column = sc.nextInt();

    int number[][] = new int[row][column];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        number[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(number[i][j] + "   ");
      }
      System.out.println();
    }
    System.out.println(" ");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(number[j][i] + "   ");
      }
      System.out.println();
    }

  }
}
```