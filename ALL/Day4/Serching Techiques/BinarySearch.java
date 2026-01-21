public class BinarySearch {
    public static void main(String []args){
        // Must be in Sorted  array for binary search
        int[] arr = {10, 20, 30, 40, 50,60,70,80,90,100,110,120};
        int target = 30;
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        System.out.println("Result found at Index :" + result); 
    }
}