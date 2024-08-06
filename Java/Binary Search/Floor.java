public class Floor{
    public static void main(String[] args) {
        int[] arr = {1,5,9,12,13,18,22,67};
        //int target = 22;
        int index= floor(arr,14);
        System.out.println(index);
    }
    //return the index
    //return index of greatest number smaller or = target
    static int floor(int[] arr, int target){
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
                return mid;
            }

        }
        return end;
    }
}