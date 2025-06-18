import java.util.Scanner;

public class reverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int lastdigit , reverse =0;
        while(n>0){
            lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit ;
            n /= 10;
        }
        System.out.println(reverse);
    }
}
