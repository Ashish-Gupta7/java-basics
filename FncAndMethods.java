// print hello
// public class FncAndMethods {

//     public static void printHello() {
//         System.out.println("Hello");
//         System.out.println("Hello");
//         System.out.println("Hello");
//     }

//     public static void main(String args[]) {
//         printHello();
//     }
// }

// calculate sum using function parameter - return type void
// import java.util.Scanner;
// public class FncAndMethods {

//     public static void calculateSum(int a, int b) {
//         int sum = a + b;
//         System.out.println("sum is : " + sum);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         calculateSum(num1, num2);
//     }
// }

// calculate sum using function parameter - return type int
// import java.util.Scanner;
// public class FncAndMethods {
//     public static int calculateSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     } 
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int sum = calculateSum(num1, num2);
//         System.out.println(sum);
//     }
// }

// calculate multiplication of two numbers - return type int
// public class FncAndMethods {
//     public static int multiply(int a, int b) {
//         int product = a * b;
//         return product;
//     }
//     public static void main(String args[]) {
//         int a = 3;
//         int b = 5;
//         int prod = multiply(a, b);
//         System.out.println(prod);
//     }
// }

// Factorial of a number, n
// import java.util.Scanner;
// public class FncAndMethods {
//     public static int factorial(int a) {
//         int f = 1;
//         for(int i = 1; i <= a; i++) {
//             f *= i;
//         }
//         return f;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int res = factorial(a);
//         System.out.println(res);
//     }
// }

// Binomial Coefficient => nCr = n!/r!(n-r)!
// import java.util.Scanner;
// public class FncAndMethods {
//     public static int factorial(int n) {
//         int f = 1;
//         for(int i = 1; i <= n; i++) {
//             f *= i;
//         }
//         return f;
//     }

//     public static int binomial(int n, int r) {
//         int nf = factorial(n);
//         int rf = factorial(r);
//         int nMinusR = factorial(n-r);
        
//         int nCr = nf/(rf*nMinusR);
//         return nCr;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         int res = binomial(n, r);
//         System.out.println(res);
//     }
// }

// Function overloading -> fnc name same but diff params
// public class FncAndMethods {
//     public static int sum(int a, int b) {
//         return a+b;
//     }
//     public static int sum(int a, int b, int c) {
//         return a+b+c;
//     }
//     public static float sum(float a, float b) {
//         return a+b;
//     }
//     public static void main(String args[]) {
//         System.out.println(sum(4, 5));
//         System.out.println(sum(4, 5, 9));
//         System.out.println(sum(4.3f, 5.3f));
//     }
// }

// check if number is prime or not ?
// public class FncAndMethods {
//     public static boolean isPrime(int n) {
//         if(n == 2) {
//             return true;
//         }

//         for(int i = 2; i < n; i++) {
//             if(n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(2));
//     }
// }

// check if number is prime or not ? optimised method.
// public class FncAndMethods {
//     public static boolean isPrime(int n) {
//         if(n == 2) {
//             return false;
//         }
//         for(int i = 2; i <= Math.sqrt(n); i++) {
//             if(n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(61));
//     }
// }

// Print all primes in a range
// import java.util.Scanner;
// public class FncAndMethods {
//   public static boolean isPrime(int n) {
//       if(n == 2) {
//           return false;
//       }
//       for(int i = 2; i <= Math.sqrt(n); i++) {
//           if(n % i == 0) {
//               return false;
//           }
//       }
//       return true;
//   }
//   public static void primeRange(int n) {
//     for(int i = 2; i <= n; i++) {
//       if(isPrime(i)) {
//         System.out.print(i + " ");
//       }
//     }
//   }
//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     primeRange(n);
//   }
// }

// Convert from binary to decimal
// public class FncAndMethods {
//   public static void binToDec(int n) {
//     int binNum = n;
//     int dec = 0;
//     int pow = 0;
//     while(binNum > 0) {
//       int lastDigit = binNum % 10;
//       dec = dec + (lastDigit * (int) (Math.pow(2, pow)));
//       pow++;
//       binNum = binNum / 10;
//     }
//     System.out.println("Decimal of " + n + " = " + dec);
//   }
//   public static void main(String args[]) {
//     binToDec(11011001);
//   }
// }

// Convert from decimal to binary
// public class FncAndMethods {
//   public static void decToBin(int n) {
//     int decNum = n;
//     int binNum = 0;
//     int pow = 0;
//     while(n > 0) {
//       int rem = n % 2;
//       binNum = binNum + (rem * (int) (Math.pow(10, pow)));
//       pow++;
//       n = n / 2;
//     }
//     System.out.println("Binary of " + decNum + " = " + binNum);
//   }
//   public static void main(String args[]) {
//     decToBin(1024);
//   }
// }