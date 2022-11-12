// You are given a number n.
// You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :

//    1
//   232
//  34543
// 4567654
//  34543
//   232
//    1

// Constraints : 

// 1 <= n <= 10
// Also, n is Odd.


import java.util.Scanner;
public class NumberDiamondPattern2
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
                if(cst <= nst / 2)
                {
                    val++;
                }
                else
                {
                    val--;
                }
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
