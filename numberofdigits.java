import java.util.Scanner;

public class numberofdigits {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
        sc.close();

        while(n>0){
            n /= 10;
            count +=1;

        }
        System.out.println(count);
    }
    
}
