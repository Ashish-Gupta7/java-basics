// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int adult = 18;
//         int age = sc.nextInt();
//         if(age >= adult) {
//             System.out.println("You can drive, vote.");
//         } else{
//             System.out.println("You are not an adult.");
//         }
//     }
// }


// print the largest of 2.
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a  > b) {
//             System.out.println("a is the largest value.");
//         } else{
//             System.out.println("b is the largest value.");
//         }
//     }
// }


// print if number is odd or even.
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a%2 == 0) {
//             System.out.println("a is an even number.");
//         } else{
//             System.out.println("a is an odd number.");
//         }
//     }
// }


// else-if
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age >= 18) {
//             System.out.println("adult");
//         } else if(age > 13 && age < 18) {
//             System.out.println("teenager");
//         } else{
//             System.out.println("child");
//         }
//     }
// }


// income tax calculator
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;
//         if(income <= 500000) {
//             System.out.println("0% tax");
//             tax = 0;
//         } else if(income > 500000 && income <= 1000000) {
//             System.out.println("5% tax");
//             tax = (int) (income * .05);
//         } else if(income > 1000000 && income <= 5000000) {
//             System.out.println("10% tax");
//             tax = (int) (income * .1);
//         } else{
//             System.out.println("20% tax");
//             tax = (int) (income * .2);
//         }

//         System.out.println("Your tax is: " + tax);
//     }
// }


// print the largest of 3 numbers.
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if((a >= b) && (a >= c)) {
//             System.out.println("a is the largest.");
//         } else if(b >= c) {
//             System.out.println("b is the largest.");
//         } else{
//             System.out.println("c is the largest.");
//         }
//     }
// }


// ternary operator
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         String aIs = (a%2 == 0) ? "even" : "odd";
//         System.out.println(aIs); 
//     }
// }

// check if a student will pass or fail.
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         String result = (a >= 33) ? "pass" : "fail";
//         System.out.println(result);
//     }
// }


// switch 
// public class conditionals {
//     public static void main(String args[]) {
//         int num = 2;
//         switch(num) {
//             case 1: System.out.println("aaa");
//             case 2: System.out.println("bbb");
//             case 3: System.out.println("ccc");
//             default : System.out.println("ddd");
//         }
//     }
// }


// calculator
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a:");
//         int a = sc.nextInt();
//         System.out.println("enter b:");
//         int b = sc.nextInt();
//         System.out.println("enter operator: +, -, *, /");
//         char operator = sc.next().charAt(0);
//         switch(operator) {
//             case '+': System.out.println(a+b);
//                     break;
//             case '-': System.out.println(a-b);
//                     break;
//             case '*': System.out.println(a*b);
//                     break;
//             case '/': System.out.println(a/b);
//                     break;
//             default :
//                       System.out.println("enter only these operators: +, -, *, /");  
            
//         }
//     }
// }


// Write a Java program to get a number from the user and print whether it is positive or negative.
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a > 0) {
//             System.out.println("a is positive number.");
//         } else{
//             System.out.println("a is negative number.");
//         }
//     }
// }


// Write a Java program to input week number(1-7) and print day of week name using switch case.
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter week in number:");
//         int a = sc.nextInt();
//         switch (a) {
//             case 1 : System.out.println("Monday");
//                     break; 
//             case 2 : System.out.println("Tuesday");
//                     break; 
//             case 3 : System.out.println("Wednesday");
//                     break; 
//             case 4 : System.out.println("Thursday");
//                     break; 
//             case 5 : System.out.println("Friday");
//                     break; 
//             case 6 : System.out.println("Saturday");
//                     break; 
//             case 7 : System.out.println("Sunday");
//                     break; 
//             default: System.out.println("Enter only these numbers: 1,2,3,4,5,6,7");
//         }
//     }
// }


// Write a Java program that takes a year from the user and print whether that year is a leap year or not.
// import java.util.Scanner;
// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year: ");
//         int a = sc.nextInt();

//         if((a%4 == 0) && (a%400 == 0)) {
//             System.out.println(a + " is a century leap year.");
//         } else if((a%4 == 0) && (a%100 != 0)) {
//             System.out.println(a + " is a leap year.");
//         } else{
//             System.out.println(a + " is a normal year.");
//         }
//     }
// }