// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format : 

// A number n

// Output Format : 

// *     *
// *     *
// *  *  *
// * * * *
// *     *

// Constraints : 

// 1 <= n <= 10
// Also, n is Odd.


import java.util.Scanner;
public class WStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // W Star Pattern.
    public static void wStarPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j == 1 || j == n)
                {
                    System.out.print("*");
                }
                else if((i > n / 2) && ((i == j) || (i + j == n +1)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        wStarPattern(n);
    }
}
