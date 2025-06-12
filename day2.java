import java.util.*;

public class day2 {
    // Sum of digits
    public static void sumdigit(int n) {
        int sum = 0;
        if (n < 0) {
            System.out.println("Enter only positive numbers");
        } else {
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }
            System.out.println("Sum of Digits: " + sum);
        }
    }

    // Fibonacci series
    public static void fib(int n) {
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series: ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < n; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

    }

    // Prime or not
    public static boolean isprime(int n) {
        boolean isPrime = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }

    // Method overloading
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Reverse Words in a Sentence
    static void reverse(String str) {
        String[] word = str.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }

    public static void Typecast() {
        // Implicit Casting
        int a = 10;
        char c = '9';
        int x = a + c;// ASCII value
        System.out.println(x);
        int l = 10;
        long l1 = l;
        System.out.println(l1);
        // Explicit Casting
        float x1 = (float) l1;
        System.out.println(x1);
        // byte range: -128 to 127
        int b = 256;
        byte v = (byte) b;
        System.out.println(v);
        String intValue = "100";
        int value = Integer.parseInt(intValue);
        System.out.println(value);
        System.out.println(String.valueOf(value));
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("Oh god enrolled me to Java!");
        System.out.println("Hi, Hello I am Abhinav");
        System.out.println("I am 19 years old");
        System.out.println("I am rated 1150 in blitz chess");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        day2.sumdigit(n);
        scanner.close();
    }
}