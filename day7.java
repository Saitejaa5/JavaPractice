import java.util.Scanner;

// import org.xml.sax.SAXNotRecognizedException;

public class day7 {
    static int[] arr = new int[5];
    static Scanner sc = new Scanner(System.in); 

    public static void initializeArray(int[] arr) {
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void sumOfArray(int[] arr) {
        initializeArray(arr);
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum of array: " + sum);
    }

    public static void minMaxOfArray(int[] arr) {
        initializeArray(arr);
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.printf("Min = %d, Max = %d\n", min, max);
    }

    public static int[][] readTwoDArray(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void printTwoDArray(int[][] matrix) {
        System.out.println("Matrix is:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void rowSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int rsum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rsum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rsum);
        }
    }

    public static void colSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int j = 0; j < cols; j++) {
            int csum = 0;
            for (int i = 0; i < rows; i++) {
                csum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + csum);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose op");
        System.out.println("1.sum of 1d array: ");
        System.out.println("2.min max of a array : ");
        System.out.println("3.sum of row and col: ");

        int op = sc.nextInt();
        sc.close();

        switch (op) {
            case 1:
                sumOfArray(arr);
                
                break;
            case 2:
                minMaxOfArray(arr);
                break;
            case 3:
                // Scanner sc = new Scanner(System.in);
                int rows = sc.nextInt();
                int cols = sc.nextInt();
                int matrix[][] = readTwoDArray(rows, cols);
                printTwoDArray(matrix);
                rowSum(matrix);
                colSum(matrix);
                break;
            default:
                System.out.println("Invalid choice: ");

        }
    }
}










































//         System.out.println("Choose Operation:");
//         System.out.println("1. Sum of 1D Array");
//         System.out.println("2. Min & Max of 1D Array");
//         System.out.println("3. 2D Array Row & Column Sum");

//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 sumOfArray(arr);
//                 break;

//             case 2:
//                 minMaxOfArray(arr);
//                 break;

//             case 3:
//                 System.out.println("Enter number of rows and columns:");
//                 int rows = sc.nextInt();
//                 int cols = sc.nextInt();
//                 int[][] matrix = readTwoDArray(rows, cols);
//                 printTwoDArray(matrix);
//                 rowSum(matrix);
//                 colSum(matrix);
//                 break;

//             default:
//                 System.out.println("Invalid choice!");
//         }

//         sc.close();  
//     }
// }
