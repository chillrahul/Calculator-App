public class Main {
    public static void main(String[] args) {
        int[] nums = { 23, 7, 8, 67, 69, 87, 12, 45, 77, -98, -9 };
        int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found otherwise if item is not
    // found return -1;

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;

            }

        }
        return -1;
    }
}