import java.util.Scanner;

public class muliplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1 ; i<=10;i++){
            System.out.println( n + " x " + i + " = " + (n *i) );
        }
    }
    
}
