package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        subsetRecurssion(nums, 0, result, list);
        return result;
    }

    public static void subsetRecurssion(int[] nums, int index, List<List<Integer>> result,  List<Integer> list){
        if(index==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        subsetRecurssion(nums, index + 1, result, list);
        list.remove(list.size()-1);
        subsetRecurssion(nums, index+1, result,list);

    }
}
