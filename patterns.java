// (1.)
// *
// **
// ***
// ****

// public class patterns {
//   public static void main(String args[]) {
//     for(int i = 1; i <= 400; i++) {
//       for(int j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


// (2.)
// ****
// ***
// **
// *

// 1st method
// public class patterns {
//   public static void main(String args[]) {
//     for(int i = 1; i <= 4; i++) {
//       for(int j = 4; j >= i; j--) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// 2nd method
// public class patterns {
//   public static void main(String args[]) {
//     int n = 4;
//     for(int i = 1; i <= n; i++) {
//       for(int j = 1; j <= (n-i+1); j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


// (3.)
// 1
// 12
// 123
// 1234

// public class patterns {
//   public static void main(String args[]) {
//     for(int i = 1; i <= 4; i++) {
//       for(int j = 1; j <= i; j++) {
//         System.out.print(j);
//       }
//       System.out.println();
//     }
//   }
// }


// (4.) 
// A
// BC
// DEF
// GHIJ

// public class patterns {
//   public static void main(String args[]) {
//     int n = 4;
//     char ch = 'A';
//     for(int i = 1; i <= n; i++) {
//       for(int j = 1; j <= i; j++) {
//         System.out.print(ch);
//         ch++;
//       }
//       System.out.println();
//     }
//   }
// }