package Strategy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        SortingContext sortingHandler = new SortingContext(new BubbleSort());
        System.out.println("Select sorting algorithm: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                sortingHandler.setStrategy(new BubbleSort());
                break;
            case 2:
                sortingHandler.setStrategy(new QuickSort());
                break;
            case 3:
                sortingHandler.setStrategy(new MergeSort());
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        long startTime = System.currentTimeMillis();
        sortingHandler.sortArray(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds.");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}