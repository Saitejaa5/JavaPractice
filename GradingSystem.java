import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        int grade = marks/10;
        sc.close();
        switch(grade){
            case 10:
            case 9:
                System.out.println("grade A ");
                break;
            case 8:
                System.out.println("grade B ");
                break;
            case 7:
                System.out.println("grade C ");
                break;
            case 6:
                System.out.println("grade D ");
                break;
            case 5:
                System.out.println("grade E ");
                break;
            default:
                System.out.println("Fail ");
        }
                
    }
    
}

// Now this is using if else


// public class GradingSystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your marks: ");
//         int marks = sc.nextInt();
//         sc.close();
//         if(marks>=90){
//             System.out.println("Grade A");
//         }else if (marks>=80) {
//             System.out.println("Grade B ");
            
//         }else if(marks>=70){
//             System.out.println("Grade C");

//         }else if(marks>=60){
//             System.out.println("Grade D");
//         }else if(marks>=50){
//             System.out.println("Grade E");
//         }else {
//             System.out.println("Fail");
//         }

    
//     }
// }
