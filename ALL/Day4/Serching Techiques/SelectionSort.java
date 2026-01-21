import java.util.Scanner;
public class SelectionSort {
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
    int min=i;
    for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min]){
            min=j;
        }
    }
    int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
}
System.out.println("Selection Sort: ");
for(int x:arr){
    System.out.print(x+" ");
}
}
}