// 1920. Build Array from Permutation

import java.util.Arrays;

public class Ch01 {

    static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0; i<ans.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
        
    }
    
    public static void main(String[] args) {

        // Input: nums = [0,2,1,5,3,4]
        // Output: [0,1,2,4,5,3]

        System.out.println(Arrays.toString(solution(new int[] {0,2,1,5,3,4})));
        
    }
    
}
