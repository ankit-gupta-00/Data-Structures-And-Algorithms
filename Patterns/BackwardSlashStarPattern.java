// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

// *
//  *
//   *
//    *
//     * 
//      *

// Constraints :

// 1 <= n <= 100


// Method 1 : ( Using i, j )

// import java.util.Scanner;
// public class BackwardSlashStarPattern
// {
//     public static Scanner scn = new Scanner(System.in);
//
//     // Backward Slash Star Pattern.
//     public static void backwardSlashStarPattern(int n)
//     {
//         for(int i = 1; i <= n; i++)
//         {
//             for(int j = 1; j <= i; j++)
//             {
//                 if(i == j)
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
//
//     public static void main(String[] args)
//     {
//         int n = scn.nextInt();
//         backwardSlashStarPattern(n);
//     }   
// }


// Method 2 : ( Using nst, nsp Variables )

import java.util.Scanner;
public class BackwardSlashStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Backward Slash Star Pattern.
    public static void backwardSlashStarPattern(int n)
    {
        int nst = 1;
        int nsp = 0;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            nsp++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        backwardSlashStarPattern(n);
    }   
}
