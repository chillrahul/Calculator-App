import java.util.*;

public class Search {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5, 4 };
        ArrayList<Integer> ans = findAllIndex2(arr, 4, 0);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);

        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}