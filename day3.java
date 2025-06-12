import java.util.Arrays;
import java.util.Scanner;

public class day3 {

    static int[] arr = new int[5];  // Shared array

    // Method to display array elements
    public static void displayElement() {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Method to initialize array using Scanner
    public static void initializeArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("You entered:");
        displayElement();
    }

    // Demo for for-each loop
    public static void demoArray() {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Demo array:");
        for (int i : a) {
            System.out.println(i);
        }
    }

    // Method to calculate sum of array elements
    public static void sumArray() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 array elements to calculate sum:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println("\nSum = " + sum);
    }

    // Method to find first occurrence of target
    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search method (array should be sorted)
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Bubble sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    // For testing reference
    public static void init(int[] a) {
        System.out.println("Inside init method:");
        System.out.println("Original: " + Arrays.toString(a));
        a[2] = -3;
        System.out.println("Modified: " + Arrays.toString(a));
    }

     public static void selectionSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find index of minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize and display
        initializeArray();

        // Sum of array
        sumArray();

        // Linear Search
        System.out.print("Enter element to search (linear): ");
        int target = sc.nextInt();
        int result = firstOccurrence(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Binary Search (after sorting)
        bubbleSort(arr);
        System.out.print("Enter element to search (binary): ");
        target = sc.nextInt();
        result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Optional: testing init method
        init(arr);

        sc.close();
    }
}
