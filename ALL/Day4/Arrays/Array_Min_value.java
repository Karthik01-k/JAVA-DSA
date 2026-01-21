public class Array_Min_value {
    public static void main(String[] args) {
        int[] arr = {100, 20, 30, 40, 50};
        int min = arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
             if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
        System.out.println("Maximum value in the array is: " + max);
    }
}