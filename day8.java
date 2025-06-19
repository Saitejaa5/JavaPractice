// import java.util.*;
public class day8 {
    public static void evenoddCount(long n){
        int even =0;
        int odd = 0;
        while(n>0){
            long ld = n % 10;

            if(ld % 2 == 0){
                even++;
            }else{
                odd++;
            }
            n/=10;
            
        }
        System.out.println("Even digits are " + even);
            System.out.println("Odd digits are " + odd);

    }


    public static void zeroCount(long n ){
        int zero = 0;
        while (n>0) {
            long ld = n % 10;
            if (ld == 0) {
                zero++;
                
            }
            n /= 10;
            
        }
        System.out.println("Number of zeros are " + zero);

    }
    public static void productOfDigits(long n){
        long sum = 1;
        while(n > 0){
            long ld = n % 10;
            sum *= ld;
            n /= 10;
        }
        System.out.println("product of digits is " + sum);
    }


    public static void evenoddSum(long n){
        int Esum = 0;
        int Osum =0;
        while(n >0){
            long ld = n % 10;
            if(ld % 2 == 0){
                Esum += ld;
            }else{
                Osum += ld;
            }
            n /=10;
        }
        System.out.println("The sum of even digits " + Esum);
        System.out.println("The sum of odd digits " + Osum);
    }
   
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // long n = sc.nextInt();
        evenoddCount(2006);
        zeroCount(2006);
        evenoddSum(10203040);
        productOfDigits(222);
        


        
        

    
    }
    
}
