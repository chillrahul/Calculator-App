public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int result = search(arr, 3);
        System.out.println(result);

    }

    static int search(int[] arr, int target) {
        int peak = peakIndexMountainArrray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;

        } else
            return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

    }

    public static int peakIndexMountainArrray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You are in decsreaing part of the array
                // this may be the answer but keep looking in left
                // this is why end != mid -1
                end = mid;
            } else {
                // you are in ascending part of the array
                start = mid + 1; // beacause we know that mid+1 element is greater than mid
            }

        }
        // int the end, start == end and pointing to the largetst number beacuse of the
        // 2 checks above
        // start and end are always trying to find max elemet in in the baove 2 checks
        // hence, when they are pointing to just that element is the max one because
        // that is what the checks say
        // more elaboration: at every point of time for start and end, they have the
        // best possible answer till that time
        // ans if we're saying that only one item is remaining,hence cuz of above line
        // that is the best answer
        return start;

    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];
        // if(arr[start]< arr[end]){
        // isAsc = true;
        // }
        // else {
        // isAsc = false;
        // }
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return start;
    }
}
