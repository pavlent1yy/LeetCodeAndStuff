package leetcode;

public class HIndex {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{0,1,3,5,6})); // 3
        System.out.println(hIndex(new int[]{1,2,100})); // 2
        System.out.println(hIndex(new int[]{1})); // 1
        System.out.println(hIndex(new int[]{0})); // 0
        System.out.println(hIndex(new int[]{100})); // 1
    }

    public static int hIndex(int[] citations) {
        int k = citations.length;
        int low = 0;
        int high = k - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(citations[mid] < k - mid)
                low = mid + 1;
            else
                high =  mid - 1;
        }
        return k - low;
    }
}
