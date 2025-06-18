import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Long num = sc.nextLong();
        sc.close();
        long sum = 0;
        while(num > 0 ){
            Long temp = num % 10;
            sum += temp;
            num = num/10;
        }
        System.out.println(sum);
    }
}
