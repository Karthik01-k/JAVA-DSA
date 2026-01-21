import java.util.Scanner;
public class Dynamic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        
        // // Input elements into the array
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        
        // // Output the elements of the array
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        
        // sc.close();
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
               System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}