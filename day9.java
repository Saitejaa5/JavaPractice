public class day9 {
    public static void sumproEqual(int n){
        int s = 0;
        int p = 1;
        while(n > 0){
            int ld = n % 10;
            s += ld;
            p *= ld;
            n /= 10;
        }
        if(s == p){
            System.out.println("yes");

        }else{
            System.out.println("not ");
        }

    }
    public static void duck(int n){
        // int s = 0;
        // String st = String.valueOf(n);
        while(n>0){
            int ld = n % 10;
            // if(st.charAt()){

            // }
            if(ld == 0){
                System.out.println("Zero detected ");

            }else{
                System.out.println("Not zero");
                
            }
            n /= 10;
        }
    }
    public static void buzz(int n){
        // int S = 0;
        // while(n > 0){
        //     int ld = n % 10;
        //     s += ld;
        //     n /= 10;   
        // }
        // System.out.println();

        if(n % 7 == 0 || n % 10 == 7){
                System.out.println(" yes");

            }else 
                System.out.println("not");
        
    }
    public static void disarium(int n ){
        int s = 0;
        int temp = n;
        int a  = String.valueOf(n).length();
        while(n > 0){
            int ld = n % 10;
            s += Math.pow(ld,a );
            a--;
            n /= 10;
        }
        if(temp == s){
            System.out.println("yes disarium");


        }else{
            System.out.println("Not diasarium");
        }

}
    public static void happyN(int n){
        int s = 0;
        int re = n;
        while(n > 0){
            int ld = n % 10;
            int temp = ld * ld;
            s += temp;
            n /= 10;
        }
        System.out.println(s);
        if(re == s){
            System.out.println("y");

        }if(re != 1 & re != 4){

        }





    }

    
    public static void main(String[] args) {
        sumproEqual(1124);
        duck(1202);
        buzz(307);
        disarium(145);
        
    }
}

    

