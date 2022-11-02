// Program to check whether the Multiple Numbers entered by the user is "Even" or "Odd".

// Sample Input :

// 8
// 0 1 -78 12 -699 13 19 -1

// Sample Output :

// Even Odd Even Even Odd Odd Odd Odd


import java.util.Scanner;
public class MultipleEvenOdd
{
    public static Scanner scn = new Scanner(System.in);

    // Print Even or Odd.
    public static void printEvenOdd(int num)
    {
        boolean result = evenOdd(num);
        if(result == true)
        {
            System.out.print("Even ");
        }
        else
        {
            System.out.print("Odd ");
        }
    }

    // Even or Odd.
    public static boolean evenOdd(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int count = scn.nextInt();
        for(int i = 1; i <= count; i++)
        {
            int num = scn.nextInt();
            evenOdd(num);
            printEvenOdd(num);
        }
    }
}
