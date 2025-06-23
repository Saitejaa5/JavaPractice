import java.util.Scanner;

public class twodarray {
    public static void rowsum(int matrix[][]){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of cols");
        int cols = sc.nextInt();
        int matrix[][] = new int[row][cols];
        System.out.println("Enter " + (row * cols) + " elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter " + i + " row " + j + " col: ");
                matrix[i][j] = sc.nextInt(); 
                
            }
           
            
        }
        sc.close();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
             System.out.println();
            
        }
        for (int i = 0; i < row; i++) {
            int rowsum =0;
            for (int j = 0; j < cols; j++) {
                rowsum+=matrix[i][j];
                
            } 
            System.out.println("sum of " + i + " row is " + rowsum);           
        }
        System.out.println();
        for (int i = 0; i < cols; i++) {
            int colSum =0;
            for (int j = 0; j < row; j++) {
                colSum+=matrix[i][j];
                
                
            }
            System.out.println("sum of " + i + " col is " + colSum);
            
        }
        System.out.println();
    }
    
}
