public class LinearSearch {
    public static void main(String []args){
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int result=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                result=i;
                break;
            }else{
                result=-1;
            }
        }
        System.out.println("Result found at Index :"+result); 
    }
}
