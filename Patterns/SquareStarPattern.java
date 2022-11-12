// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

// *****
// *****
// *****
// *****
// *****


import java.util.Scanner;
public class SquarePattern
{
    public static Scanner scn = new Scanner(System.in);

    // Square Star Pattern.
    public static void squarePattern(int n)
    {
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            nst = n;
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        int n = scn.nextInt();
        squarePattern(n);
    }
}
