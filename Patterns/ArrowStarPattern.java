// You are given a number n.
// You've to write code to print the pattern given in output format below.

// Input Format :

// A number n

// Output Format :
  
//   *
//   **
// *****
//   **
//   *

// Constraints :

// 1 <= n <= 10
// Also, n is Odd.


import java.util.Scanner;
public class ArrowStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Arrow Star Pattern.
    public static void arrowStarPattern(int n)
    {
       int nsp = n / 2;
       int nst  = 1;
       for(int row = 1; row <= n; row++)
       {
            if(row == (n / 2) + 1)
            {
                nst = n;
                for(int cst = 1; cst <= nst; cst++)
                {
                    System.out.print("*");
                }
                nst -= (n / 2);
            }
            else
            {
                for(int csp = 1; csp <= nsp; csp++)
                {
                    System.out.print(" ");
                }
                for(int cst = 1; cst <= nst; cst++)
                {
                    System.out.print("*");
                }
            }
            if(row <= (n / 2))
            {
                nst++;
            }
            else
            {
                nst--;
            }
            System.out.println();
       }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        arrowStarPattern(n);
    }
}
