// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format : 

// ******
// *****
// ****
// ***
// **
// *

// Constraints : 

// 1 <= n <= 100


import java.util.Scanner;
public class InvertedRightTriangleStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Inverted Right Triangle Star Pattern.
    public static void invertedRightTriangleStarPattern(int n)
    {
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            nst--;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        invertedRightTriangleStarPattern(n);
    }
}
