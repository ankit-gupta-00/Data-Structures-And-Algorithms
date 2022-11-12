// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :
  
//   * 
//  * *
// *   *
//  * *
//   *

// Constraints : 

// 1 <= n <= 100
// Also, n is Odd.


import java.util.Scanner;
public class HollowDiamondStarPattern3
{
    public static Scanner scn = new Scanner(System.in);

    // Hollow Diamond Star Pattern.
    public static void hollowDiamondStarPattern(int n)
    {
        int nspO = n / 2;
        int nspI = -1;
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
            if(row > 1 && row < n)
            {
                System.out.print("*");
            }
            if(row <= (n / 2))
            {
                nspO--;
                nspI += 2;
            }
            else
            {
                nspO++;
                nspI -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        hollowDiamondStarPattern(n);
    }
}
