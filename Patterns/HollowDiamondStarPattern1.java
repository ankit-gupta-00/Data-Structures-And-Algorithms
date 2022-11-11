// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

// ***** *****
// ****   **** 
// ***     *** 
// **       **
// *         *
// **       **
// ***     *** 
// ****   ****
// ***** *****

// Constraints :

// 1 <= n <= 100
// Also, n is Odd.



import java.util.Scanner;
public class HollowDiamondStarPattern1
{
    public static Scanner scn = new Scanner(System.in);

    // Hollow Diamond Star Pattern.
    public static void hollowDiamondStarPattern(int n)
    {
        int nst = (n / 2) + 1;
        int nsp = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            if(row <= (n / 2))
            {
                nst--;
                nsp += 2;
            }
            else
            {
                nst++;
                nsp -= 2;
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
