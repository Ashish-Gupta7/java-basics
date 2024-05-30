// print hello 100 times (while loop)
// public class loops {
//     public static void main(String args[]) {
//         int counter = 0;
//         while(counter < 100) {
//             System.out.println("hello");
//             counter++;
//         }
//     }
// }

// print hello 100 times (for loop)
// public class loops {
//     public static void main(String args[]) {
//         for(int counter = 0; counter < 100; counter++) {
//             System.out.println("Hello");
//         }
//     }
// }

// print number from 1 to 10 (while loop)
// public class loops {
//     public static void main(String args[]) {
//         int counter = 1;
//         while(counter <= 10) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }

// print number from 1 to 10 (for loop)
// public class loops {
//     public static void main(String args[]) {
//         for(int counter = 1; counter <= 10; counter++) {
//             System.out.print(counter + " ");
//         }
//     }
// }

// print number from 1 to n (while loop)
// import java.util.Scanner;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int counter = 1;
//         while(counter <= n) {
//             System.out.print(counter + " ");
//             counter++;
//         }
//     }
// }

// print number from 1 to n (for loop)
// import java.util.Scanner;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++) {
//             System.out.print(i + " ");
//         }
//     }
// }

// print sum of first n natural numbers (while loop)
// import java.util.Scanner;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//         while(i <= n) {
//             sum += i;
//             i++;
//         }
//         System.out.println("sum is : " + sum);
//     }
// }

// print sum of first n natural numbers (for loop)
// import java.util.Scanner;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 1; i <= n; i++) {
//             sum += i;
//         }
//         System.out.println("sum is : " + sum);
//     }
// }

// print square(4*4) pattern (while loop)
// public class loops {
//     public static void main(String args[]) {
//         int i = 1;
//         while(i <= 4) {
//             System.out.println("****");
//             i++;
//         }
//     }
// }

// print square(4*4) pattern (for loop)
// public class loops {
//     public static void main(String args[]) {
//         for(int i = 1; i <= 4; i++) {
//             System.out.println("****");
//         }
//     }
// }

// print reverse of a number (while loop)
// public class loops {
//     public static void main(String args[]) {
//         int n = 12091999;
//         while(n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n /= 10;
//         }
//     }
// }

// print reverse of a number (for loop)
// public class loops {
//     public static void main(String args[]) {
//         for(int n = 851974; n > 0; n /= 10) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//         }
//     }
// }

// reverse the given number (while loop)
// public class loops {
//     public static void main(String args[]) {
//         int n = 19840702;
//         int rev = 0;
//         while(n > 0) {
//             int lastDigit = n % 10;
//             rev = rev * 10 + lastDigit;
//             n /= 10;
//         }
//         System.out.println(rev);
//     }
// }

// reverse the given number (for loop)
// public class loops {
//     public static void main(String args[]) {
//         int rev = 0;
//         for(int n = 19840702; n > 0; n /= 10) {
//             int lastDigit = n % 10;
//             rev = rev * 10 + lastDigit;
//         }
//         System.out.println(rev);
//     }
// }

// print hello 101 times (do while loop)
// public class loops {
//     public static void main(String args[]) {
//         int counter = 0;
//         do{
//             System.out.println("Hello");
//             counter++;
//         } while(counter <= 100);
//     }
// }

// keep entering numbers till user enters a multiple of 10 (break statement)
// import java.util.Scanner;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Enter your number : ");
//             int n = sc.nextInt();
//             if(n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         } while(true);
//     }
// }

// Display all numbers entered by user except multiples of 10 (continue statement)
// import java.util.Scanner;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Enter your number :  ");
//             int n = sc.nextInt();

//             if(n % 10 == 0) {
//                 continue;
//             }
//             System.out.println(n);
//         } while(true);
//     }
// }

// check if a number is prime or not
// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(Math.sqrt(n));

//         if(n == 2) {
//             System.out.println("n is a prime number");
//         } else{
//             boolean isPrime = true;
//             for(int i = 2; i <= Math.sqrt(n); i++) {  // Math.sqrt(n) < (n-1)
//                 if(n % i == 0) {
//                     isPrime = false;
//                 }
//             }
//             if(isPrime == true) {
//                 System.out.println("n is a prime number");
//             } else{
//                 System.out.println("n is not a prime number");
//             }
//         }
//     }
// }