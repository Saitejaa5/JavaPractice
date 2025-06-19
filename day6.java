import java.util.Scanner;

public class day6 {
    public static void reSt(String st){
        String re = "";
        for (int i =st.length()-1 ; i>=0; i--) {
            re += st.charAt(i);
            
        }
        System.out.println(re);
        if(re.equalsIgnoreCase(st)){
            System.out.println("yes");
        }else{
            System.err.println("No");
        }
    }
    public static void stPali(String st){
        // reSt(st);
        // if(st.equalsIgnoreCase(re)){
        //     System.out.println("yes");
        // }else{
        //     System.err.println(No);
        // }
    }

































    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();
        String re = "";
        for (int i = st.length()-1; i >= 0; i--) {
            re += st.charAt(i);

            
        }
        System.out.println(re);


    }
    
}
