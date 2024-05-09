package array;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args)
	{
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        
        Arrays.sort(arr);
        System.out.println("The sorted array is:");
        for (int num : arr) {
            System.out.print(num + ",");
        }
    }

	}

