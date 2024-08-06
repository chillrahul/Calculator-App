public class MountainIndex {
    public static void main(String[] args) {
        
    }

    public int peakIndexMountainArrray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //You are in decsreaing part of the array
                //this may be the answer but keep looking in left
                //this is why end != mid -1
                end = mid;
            }
            else{
                //you are in ascending part of the array
                start = mid+1; // beacause we know that mid+1 element is greater than mid
            }

        }
        //int the end, start == end and pointing to the largetst number beacuse of the 2 checks above
        // start and end are always trying to find max elemet in in the baove 2 checks
        //hence, when they are pointing to just that element is the max one because that is what the checks say
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time
        //ans if we're saying that only one item is remaining,hence cuz of above line that is the best answer
        return start; 

    }
}
