// public class QuickSort {
//    public static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int pi = partition(arr, low, high);
//             quickSort(arr, low, pi - 1);
//             quickSort(arr, pi + 1, high);
//         }
//     }

//     public static int partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = (low - 1);
//         for (int j = low; j < high; j++) {
//             if (arr[j] < pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;
//         return i + 1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 7, 8, 9, 1, 5};
//         int n = arr.length;
//         quickSort(arr, 0, n - 1);
//         System.out.println("Sorted array:");
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }
// //output: Sorted array: 1 5 7 8 9 10
import java.util.Scanner;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i < high && arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int k = 0;
        while (k < n) {
            arr[k] = sc.nextInt();
            k++;
        }

        quickSort(arr, 0, n - 1);

        int i = 0;
        while (i < n) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}

