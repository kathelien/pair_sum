package hashing;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            set.add(num);
        }

        int longest = 0;

        for(int num : set)
        {
            if(!set.contains(num - 1))
            {
                int current = num;
                int count = 1;

                while(set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                if(count > longest)
                {
                    longest = count;
                }
            }
        }

        System.out.println("Longest Sequence Length = " + longest);
    }
}
