package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumOfArray {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size == 0){
            throw new IllegalArgumentException("Array size can't be zero");
        }

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        int minElement= findMinimum(arr);

        System.out.println("Minimum element in the Array " + minElement );

        scanner.close();

        //.......
    }

    public static int findMinimum(int[] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
     
}
