package Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] oddNumbers = removeEvenNumbers(numbers);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Array after removing even numbers: " + Arrays.toString(oddNumbers));

        scanner.close();
    }

    public static int[] removeEvenNumbers(int[] numbers) {
        int countOdd = 0;

        // Count the number of odd numbers in the array
        for (int num : numbers) {
            if (num % 2 != 0) {
                countOdd++;
            }
        }

        // Create a new array to store the odd numbers
        int[] oddNumbers = new int[countOdd];
        int index = 0;

        // Populate the new array with odd numbers
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }

        return oddNumbers;
    }
}
