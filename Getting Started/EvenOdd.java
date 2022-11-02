// Program to check whether a Number entered by the user is "Even" or "Odd".

// Input Format :

// A number num

// Output Format :

// num is Even or Odd.

// Sample Input 1 :

// 0

// Sample Output 1 :

// 0 is Even.

// Sample Input 2 :

// 1

// Sample Output 2 :

// 1 is Odd.

// Sample Input 3 :

// -698

// Sample Output 3 : 

// -698 is Even.


// Method 1 : 

// import java.util.Scanner;
// public class EvenOdd
// {
//     public static Scanner scn = new Scanner(System.in);
//
//     // Even or Odd.
//     public static void evenOdd(int n)
//     {
//         if(n % 2 == 0)
//         {
//             System.out.print(n + " is Even.");
//         }
//         else
//         {
//             System.out.print(n + " is Odd.");
//         }
//     }
//
//     public static void main(String[] args)
//     {
//         int num = scn.nextInt();
//         evenOdd(num);
//     }
// }


// Method 2 :

import java.util.Scanner;
public class EvenOdd
{
    public static Scanner scn = new Scanner(System.in);

    // Print Even or Odd. 
    public static void printEvenOdd(int num)
    {
        boolean result = evenOdd(num);
        if(result == true)
        {
            System.out.print(num + " is Even.");
        }
        else
        {
            System.out.print(num + " is Odd.");
        }
    }

    // Even or Odd.
    public static boolean evenOdd(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int num = scn.nextInt();
        evenOdd(num);
        printEvenOdd(num);
    }
}
