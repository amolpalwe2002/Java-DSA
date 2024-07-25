// 1929. Concatenation of Array

import java.util.Arrays;

public class Ch02 {
    static int[] solution(int[] nums){
        int[] ans = new int[2*nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        

    //     Input: nums = [1,2,1]
    //     Output: [1,2,1,1,2,1]

        System.out.println(Arrays.toString(solution(new int[] {1,2,1})));
        

    }
    
}
