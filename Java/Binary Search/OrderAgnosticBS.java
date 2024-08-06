public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,5,9,12,13,18,22,67};
        //int target = 62;
        int[] n = {23,12,9,6,2,1};
        int index = orderAgnosticBS(n,12);
        System.out.println(index);
        }

    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start]< arr[end] ;
//        if(arr[start]< arr[end]){
//            isAsc = true;
//        }
//        else {
//            isAsc = false;
//        }
        while (start <= end){
            //     int mid = (start + end)/2; //might be possible that (start + end) exceeds the range of int in Java
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;

                }
                else if(target > arr[mid]){
                    start = mid +1;
                }

            }
            else {
                if(target > arr[mid]){
                    end = mid -1;

                }
                else if(target < arr[mid]){
                    start = mid +1;
                }
            }

        }
        return start;
    }
}
