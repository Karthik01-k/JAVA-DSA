import java.util.Scanner;
public class Bubblesort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swapped=true;
                }
            }
            if(swapped==false){
            break;
        }
        }   
        System.out.println("Sorted order:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
//time complexity: O(n^2) in worst and average case
//time complexity: O(n) in best case(when array is already sorted)
//space complexity: O(1) as no extra space is used