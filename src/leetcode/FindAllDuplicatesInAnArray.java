package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        System.out.println(findDuplicatesClever(new int[]{4,3,2,7,8,2,3,1})); // [2,3]
    }

    public static List<Integer> findDuplicates(int[] nums) { // My solutuion
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(); 
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else{
                list.add(nums[i]);
            }
        }
        return list; 
    }

    public static List<Integer> findDuplicatesClever(int[] nums) {
        List<Integer> outputArray = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0)
                outputArray.add(index + 1);
            nums[index] = -nums[index];
        }

        return outputArray;
    }
}
