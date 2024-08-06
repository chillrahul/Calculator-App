public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 145, 160, 175 };
        int target = 10;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        // first find the range
        // first stat with a box of sixe 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end + size of box * 2
            end = (end - start + 1) * 2 + end;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int arr[], int target, int start, int end) {
        // int ans = -1;
        // int start = 0;
        // int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans = mid;
                return mid;

            }

        }
        return -1;
    }
}