// (1.) In a program, input 3 numbers: A, B and C. You have to output the average of these numbers.

// import java.util.Scanner;
// public class practiceVariables {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int avg = (a + b + c)/3;
//         System.out.println(avg);
//     }
// }


// (2.) In a program input the side of a square. You have to output the area of the square.

// import java.util.Scanner;
// public class practiceVariables {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();
//         int area = side * side;
//         System.out.println(area);
//     }
// }


// (3.) Enter cost of 3 items from user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on: You can also try adding 18% gst tax to the items in the bill as an advanced problem.)

// import java.util.Scanner;
// public class practiceVariables {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float pencil = sc.nextFloat();
//         float eraser = sc.nextFloat();
//         float pen = sc.nextFloat();
//         // float totalCost = pencil + eraser + pen;
//         // System.out.println(totalCost);

//         float withGST = (pencil + pen + eraser) - 18/100;
//         System.out.println(withGST);
//     }
// }


// (4.) What will be the type of result in the following java code?

// public class practiceVariables {
//     public static void main(String args[]) {
//         byte b = 4;
//         char c = 'a';
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f;
//         double d = 99.9827;
//         int result = (f * b) + (i % c) - (d * s);
//     }
// }

// (f * b) + (i % c) - (d * s), ye double data type hai, kyuki float aur double me se double ki value badi hai.
// output --> lossy conversion from double to int


// (5.) Will the following statement give any error in java?
// int $ = 24;

// public class practiceVariables {
//     public static void main(String args[]) {
//         int $ = 24;
//         System.out.println($);
//     }
// }

// no.