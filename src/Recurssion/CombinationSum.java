package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr= new int[]{2,3,6,7};
        combinationSum(arr,7);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        // STEPS :
        // 1. Recurssion :- take and not take
        //  1.1 target (candidates, targe, 0, Lis<List<Interger>> res, sum)
        //  1.2 Base condition :  if (sum==targe). add in res
        //  1.3  while take:
        //  1.4 while not take:
        // 2. no. can be revisit them self.

        List<List<Integer>> res= new ArrayList<>();
        genrateCombination(candidates, target, res, 0, 0, new ArrayList<>());
        return res;
    }

    public static void genrateCombination(int[] candidates, int target, List<List<Integer>>res, int index, int sum,
                                          List<Integer> sumArray){
        // Base Condition
        if(sum==target ){
            res.add(new ArrayList<>(sumArray));
            return;
        }
        if (sum > target || index >= candidates.length) {
            return;
        }
        sumArray.add(candidates[index]);
        genrateCombination(candidates, target, res, index, candidates[index]+sum,sumArray);
        sumArray.remove(sumArray.size()-1);
        genrateCombination(candidates, target, res, index+1, sum,sumArray);

    }
}
