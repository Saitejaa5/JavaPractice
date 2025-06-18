import java.util.Scanner;

public class logincheck {
    public static void main(String[] args) {
        String user = "xyz";
        String pass = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter the password: ");
        String password = sc.nextLine();
        sc.close();

        if(user.equals(username) && pass.equals(password)){
            System.out.println("Valid credentials");

        }else {
            System.out.println("Invalid credentials");
        }
    }
}
