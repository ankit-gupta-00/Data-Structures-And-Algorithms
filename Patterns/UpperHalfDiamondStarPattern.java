// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :
    
//     *
//    ***
//   *****
//  *******
// *********


import java.util.Scanner;
public class UpperHalfDiamondStarPattern
{
    public static Scanner scn = new Scanner(System.in);

    // Upper Half Diamond Star Pattern.
    public static void upperHalfDiamondStarPattern(int n)
    {
        int nsp = n - 1;
        int nst = 1;
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
            nsp--;
            nst += 2;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        upperHalfDiamondStarPattern(n);
    }
}
