package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));

        scanner.close();
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move left index to the right and right index to the left
            left++;
            right--;
        }
    }
}


