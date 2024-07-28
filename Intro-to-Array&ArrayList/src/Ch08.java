import java.util.Arrays;

public class Ch08 {

    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i]) count++;
            }
            ans[i] = count;
        }

        return ans;
        
    }
    public static void main(String[] args) {
        // Input: nums = [8,1,2,2,3]
        // Output: [4,0,1,1,3]

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
        
    }
    
}
