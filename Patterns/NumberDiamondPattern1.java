// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

//     1
//    222
//   33333
//  4444444
// 555555555
//  4444444
//   33333
//    222
//     1

// Constraints : 

// n is Odd.


import java.util.Scanner;
public class NumberDiamondPattern1
{
    public static Scanner scn = new Scanner(System.in);

    // Number Diamond Pattern.
    public static void numberDiamondPattern(int n)
    {
        int nsp = n / 2;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            int val = row;
            if(row > (n / 2) + 1)
            {
                val = n - row + 1;
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(val);
            }
            val++;
            if(row <= (n / 2))
            {   
                nsp--;
                nst += 2;
            }
            else
            {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        numberDiamondPattern(n);
    }
}
