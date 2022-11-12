// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

// *     *
//  *   *
//   * *
//    *
//   * *
//  *   *
// *     *

// Constraints : 

// 1 <= n <= 100
// Also, n is Odd.


// Method 1 : ( Using i ,j )

// import java.util.Scanner;
// public class CrossStarPattern
// {
//     public static Scanner scn = new Scanner(System.in);

//     // Cross Star Pattern.
//     public static void crossStarPattern(int n)
//     {
//         for(int i = 1; i <= n; i++)
//         {
//             for(int j = 1; j <= n; j++)
//             {
//                 if((i == j) || ((i + j) == (n + 1)))
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args)
//     {
//         int n = scn.nextInt();
//         crossStarPattern(n);
//     }
// }


// Method 2 : ( Using nspO, nspI Variables )

import java.util.Scanner;
public class CrossStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Cross Star Pattern.
    public static void crossStarPattern(int n)
    {
       int nspO = 0;
       int nspI = n - 2;
       for(int row = 1; row <= n; row++)
       {
            for(int cspO = 1; cspO <= nspO; cspO++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int cspI = 1; cspI <= nspI; cspI++)
            {
                System.out.print(" ");
            }
            if(row != (n / 2) + 1)
            {
                System.out.print("*");
            }
            if(row <= (n / 2))
            {
                nspO++;
                nspI -= 2;
            }
            else
            {
                nspO--;
                nspI += 2;
            }
            System.out.println();
       } 
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        crossStarPattern(n);
    }
}
