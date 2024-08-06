public class RotatedBSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int result = search(arr, 6);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you can't find pivot, it means array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if pivot found , then there is 2 ascending arrays
        // case 1
        if (nums[pivot] == target) {
            return pivot;
        }
        // case 2
        else if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot);

        } else if (target < nums[0]) {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        return -1;
    }

    static int binarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            // int mid = (start + end)/2; //might be possible that (start + end) exceeds the
            // range of int in Java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return -1;

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            // 4 cases over here

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
