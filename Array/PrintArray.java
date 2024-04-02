package Array;

public class PrintArray {

    public void printArray(int[] arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrintArray a= new PrintArray();
        a.printArray(new int[] {2,4,5,7,9,2});
    }
}
