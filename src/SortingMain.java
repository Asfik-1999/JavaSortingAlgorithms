import java.util.Scanner;

public class SortingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Choose a sorting algorithm:");
        System.out.println("1: Merge Sort");
        System.out.println("2: Quick Sort");
        System.out.println("3: Bubble Sort");
        System.out.println("4: Selection Sort");
        System.out.println("5: Insertion Sort");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                MergeSort.sort(array);
                System.out.println("Array sorted using Merge Sort:");
                break;
            case 2:
                QuickSort.sort(array);
                System.out.println("Array sorted using Quick Sort:");
                break;
            case 3:
                BubbleSort.sort(array);
                System.out.println("Array sorted using Bubble Sort:");
                break;
            case 4:
                SelectionSort.sort(array);
                System.out.println("Array sorted using Selection Sort:");
                break;
            case 5:
                InsertionSort.sort(array);
                System.out.println("Array sorted using Insertion Sort:");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
