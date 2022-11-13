// You are given a number n.
// You've to write code to print the pattern given in output format below.

// Input Format : 

// A number n

// Output Format :

// *******
//  *   *
//   * *
//    *
//   ***
//  *****
// *******

// Constraints : 

// 1 <= n <= 10
// Also, n is Odd.


import java.util.Scanner;
public class TwoTriangleStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Two Triangle Star Pattern.
    public static void twoTriangleStarPattern(int n)
    {
        int nsp = 0;
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                if(row > 1 && row <= (n / 2) && cst > 1 && cst < nst)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            if(row <= (n / 2))
            {
                nsp++;
                nst -= 2;
            }
            else
            {
                nsp--;
                nst += 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        twoTriangleStarPattern(n);
    }
}
