
import java.util.*;
public class day4 {
    public static void fibN(){
        Scanner sc = new Scanner(System.in);
        int n3;
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.printf(" series upto %d are ",n);
        System.out.println(n1);
        System.out.println(n2);
        sc.close();
        for (int i = 2; i <=n; i++) {
            n3 = n1+n2;
            System.out.println(n3);

            n1=n2;
            n2=n3;
            
        }
        System.out.println();
    }
    public static void perfectN(int n ){
        int sum = 0;
        int org = n;
        for (int i = 1; i < n/2; i++) {
            if( n % i == 0){
                sum += i;
            }
            System.out.println("sum is : " + sum);
        }
        if(org == n ){
            System.out.println("perfect");
        }else{
            System.out.println("not perfect");
        }
    }
    public static void neonN(int n ){
        long square = n * n ;
        int sum = 0;
        int org = n;
        while(square > 0){
            long temp = square % 10;
            sum += square;
            square /= 10;
        }
        System.out.println("sum is : " + sum);
        if(org == n) 
            System.out.println("YES");
        else
            System.out.println("no");

    }
    public static void harshadN(int n){
        int sum = 0;
        int n1 = n;
        while(n > 0){
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }

        if(n1 % sum == 0){
            System.out.println("harshad");
        }else{
            System.out.println("Not harshad");
        }
    }
        static int factorial(int n){
        int fact = 1;
        for (int i = 0; i <= n; i++) {
            fact *= i;
            
        }
        return fact;
    }

    public static void strongN(int n){
        int sum = 0;
        int n1 = n ;
        while (n > 0){
            int t = n % 10;
            sum += factorial(t);
            n /= 10;
        }
        if(sum == n1) System.out.println("Strong");
        else System.err.println("not ");
    }

    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();
    
        // fibN();
        // neonN(18);
        // perfectN(20);
        // harshadN(18);
        // strongN(145);
    }
}
