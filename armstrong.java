
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int armstrong= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int original = n;
        while(n>0){
            int temp = n % 10;
            armstrong += temp * temp * temp;
            n /= 10;
        }
        if(original==armstrong){
            System.out.println("It is an armstrong number");

        }else{
            System.out.println("Not an armstrong number");
        }
        
    }
}
    





    // static void armstrong(int n ){
    //     int sum = 0;
    //     int lastdigit;
    //     int org = n ;
    //     while(n > 0){
    //         lastdigit = n % 10;
    //         sum += lastdigit * lastdigit * lastdigit;
    //         n = n / 10;
            
    //     }
        
    //     if(org == sum){
    //         System.out.println("armstrong");

    //     }else {
    //         System.out.println("not armstrong");
    //     }

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     sc.close();
    //     armstrong(n);
    // }


// }
