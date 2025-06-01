package leetcode;

import java.util.Arrays;

public class MinimumCommonValue {
    public static void main(String[] args) {
        // System.out.println(getCommon(new int[]{6,13,18,18,28,34,37,39,46,50,52,54,62,63,65,66,75,80,97,98}, 
        //                         new int[] {10,13,13,19,27,33,40,41,43,46,56,61,69,72,78,79,82,88,91,94})); // 13
        // System.out.println(getCommon(new int[]{1,2,3}, new int[]{2, 4})); // 2
        // System.out.println(getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5})); // 2
        System.out.println(getCommon(new int[]{2,4}, new int[]{1,2})); // 2
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        System.out.println("nums1");
        Arrays.stream(nums1).forEach(e -> System.out.println(e + " "));
        System.out.println("nums2");
        Arrays.stream(nums2).forEach(e -> System.out.println(e + " "));
        if(nums1[0] == nums2[0])
            return nums1[0];
        else if(nums1[0] < nums2[0])
            return getCommon(removeFirstElement(nums1), nums2);
        else if(nums1[0] > nums2[0])
            return getCommon(nums1, removeFirstElement(nums2));
        return 0;
    }

    public static int[] removeFirstElement(int[] arr) {
        int newArr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }
}










