import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digits: ");
        int n = sc.nextInt();
        System.out.println("Enter first digit: ");
        int f = sc.nextInt();

        System.out.println("Enter second digit: ");
        int s = sc.nextInt();
        sc.close();
        System.out.println(f);
        System.out.println(s);
        System.out.printf("Fibonacci series upto %d digits\n",n);

        for(int i = 3 ;i<=n;i++){
            t=f+s;
            
            System.out.println(t);
            f=s;
            s=t;


        }
        
    }

}