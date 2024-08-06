import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] a = { 9, 8, 2, 3, 1, 7, 6, 4 };
        bubble(a);
        System.out.println(Arrays.toString(a));

    }

    static void bubble(int[] arr) {
        boolean swappped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swappped = true;
                }
            }
            if (!swappped) {
                break;
            }
        }

    }
}
