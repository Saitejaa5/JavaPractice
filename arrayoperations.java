public class arrayoperations {
    static int arr[] = new int[5];
    public static void main(String[] args) {
        int arr[] = { 2 , 4 , 6 , 8 , 10};
        
        arr[0] = 0;
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        int ar[] = {10 , 5 , 15 , 30 , 20};
        int max = ar[0] , min = ar[0] , sum = 0;
        for(int j = 0 ; j < ar.length ; j ++){
            if(ar[j] > max ) max = ar[j];
            if(ar[j] < min) min = ar[j];
            sum += ar[j];
        }
        System.out.printf("min %d, max %d , sum of array are  %d: ", min , max , sum);

        for(int i = arr.length - 1 ; i>=0 ;i--){
            System.out.println(arr[i] + " ");

        }
        for(int i = ar.length - 1 ; i>=0;i--){
            System.out.println(ar[i] + " ");

        }

        

    }
    
}
