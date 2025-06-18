// import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        int n =5;
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print( j +  " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("j");
                
            }
            System.out.println(); 
        }
        int a = 5;
        int b = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=b; j++) {
                if( i==1 || j==1 || i == a || j == b){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
