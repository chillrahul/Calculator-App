public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 9, 12, 13, 18, 22, 67 };
        // int target = 22;
        int index = binarySearch(arr, 14);
        System.out.println(index);
    }

    // return the index
    // retuen -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end)/2; //might be possible that (start + end) exceeds the
            // range of int in Java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }
        return -1;
    }
}