import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        long factorial = 1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        sc.close();
        if(number < 0){
            System.out.printf("Cannot find the value of factorial of number %d",number);

        }else if(number <= 1 ){
            System.out.printf("%d! = %d",number ,factorial);

        }else{
            for(int i = number ; i >= 2; i--){
                factorial *= i;
            }
            System.out.printf("%d! = %d",number,factorial);

        }

    }
}
