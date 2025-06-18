import java.util.Scanner;

public class FactorialRecursion {
    static int factorial(int n){
        if(n <= 1)
            return 1;
        else 
            return n * factorial(n-1);
    
    }
    public static void main(String[] args) {
        int number, result;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        result = factorial(number);
        System.out.println(result);



    }
}
