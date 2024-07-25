// 1480. Running Sum of 1d Array

import java.util.Arrays;

public class Ch03 {

    static int sum(int[] arr, int n){
        int res = 0;
        for(int i=0; i<=n; i++){
            res+=arr[i];
        }

        return res;
    }

    static int[] solution(int[] nums){
        // int[] ans = new int[nums.length];
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            // ans[i] = sum(nums, i);

            nums[i] += sum;
            sum = nums[i];
        }

        return nums;
    }
    public static void main(String[] args) {

        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]

        System.out.println(Arrays.toString(solution(new int[] {1,2,3,4})));
        
    }
    
}
