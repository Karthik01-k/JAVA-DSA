public class CountElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int count = 0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum=sum+arr[i];
        }      
        System.out.println("Number of elements in the array is: " + count);
        System.out.println("Sum of elements in the array is: " + sum);
    }
}