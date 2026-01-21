public class InsertionSort {
    public static void main(String args[]){
     int arr[]={4,5,6,6,78,989,9,45,23,12,1};
     int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){   
            System.out.print(arr[i]+" ");
        }      
    }
}
