import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    // static int getMaxIndex(int[] arr, int start, int end) {
    // int max = start;
    // for (int i = start; i < arr.length - 1; i++) {
    // if (arr[max] < arr[i]) {
    // max = i;
    // }
    // }
    // return max;
    // }

    // static void selection(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // // swap largest element with wits correct index
    // int last = arr.length - i - 1;
    // int maxIndex = getMaxIndex(arr, 0, last);
    // swap(arr, maxIndex, last);
    // }
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }
    static void selection(int[] arr) {
        // find max index

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            // then swap it with correct index
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }

    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }
    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
