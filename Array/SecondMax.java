package Array;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = scan.nextInt();
        }

        int secondMax = findSecondMax(arr);
        System.out.println("The second maximum of the array is " + secondMax);
    }

    public static int findSecondMax(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array size must be at least 2.");
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
