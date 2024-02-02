
// public class Demo {
//   public static void main(String args[]) {

//     int a, b, c;

//     a = Integer.parseInt(args[0]);
//     b = Integer.parseInt(args[1]);
//     c = a + b;
//     System.out.println("sum is : " + c);
//   }
// }

// if developer dont know clearly about the input. like how many input will pass by user then it will develop program  like this 

public class Demo {
  public static void main(String ab[]) {

    int sum = 0;
    int i, len;
    len = ab.length;

    for (i = 0; i < len; i++) {
      sum = sum + Integer.parseInt(ab[i]);
    }

    System.out.println(sum);
  }
}
