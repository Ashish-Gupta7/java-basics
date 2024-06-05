// import java.util.Scanner;

// public class input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // String input = sc.next();
//         // System.out.println(input);

//         // String input = sc.nextLine();
//         // System.out.println(input);

//         // int num = sc.nextInt();
//         // System.out.println(num);

//         // float dec = sc.nextFloat();
//         // System.out.println(dec);
//         sc.close();
//     }
// }


// buffer issue in Java Scanner =>
// import java.util.Scanner;
// public class input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         double d = sc.nextDouble();
//         sc.nextLine();   // agar aap iss line ki madad se buffer ko clear nhi krte hai to aap variable 's' ke liye user se input nhi le payege.
//         String s = sc.nextLine();
//         System.out.println("String : " + s);
//         System.out.println("Double : " + d);
//         System.out.println("Int : " + i);
//     }
// }