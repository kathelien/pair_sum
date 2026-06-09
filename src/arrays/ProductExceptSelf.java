package arrays;

import java.util.Scanner;

public class ProductExceptSelf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            int product = 1;

            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    product *= arr[j];
                }
            }

            result[i] = product;
        }

        System.out.println("Output:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}

