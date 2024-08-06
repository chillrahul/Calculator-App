public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,32,78,99,87,9};
         int target = 9;
        System.out.println("Elemet at indext "+linearSearch(arr,target));
    }

    static int  linearSearch(int[] arr, int target){
       //if an array is empty
        if (arr.length == 0){
           return -1;


       }
        //for loop
        for ( int index=0; index <= arr.length; index++ ){
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
