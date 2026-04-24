import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        double sum = 0;
        for(int i=0;i<n;i++)sum += array[i];
        double average = sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
