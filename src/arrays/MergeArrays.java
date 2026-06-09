package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr1: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter arr1 elements:");
        for(int i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of arr2: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter arr2 elements:");
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        for(int i = 0; i < n1; i++)
        {
            merged[i] = arr1[i];
        }

        for(int i = 0; i < n2; i++)
        {
            merged[n1 + i] = arr2[i];
        }

        Arrays.sort(merged);

        System.out.print("Merged Array: ");

        for(int num : merged)
        {
            System.out.print(num + " ");
        }
    }
}
