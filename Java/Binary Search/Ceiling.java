

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        //int target = 22;
        int index= ceiling(arr,15);
        System.out.println(index);
    }
    //return the index
    //return index of smallest number greater or = target
    static int ceiling(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            //     int mid = (start + end)/2; //might be possible that (start + end) exceeds the range of int in Java
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;

            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                //ans found
                return mid;
            }

        }
        return start;
    }
}