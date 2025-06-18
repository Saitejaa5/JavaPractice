import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n = sc.nextInt();
        sc.close();
        if(n % 2 == 0){
            System.out.println("even");

        }else{
            System.out.println("Odd");
        }
    }
    
}
