
// 1389. Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;
public class Ch09 {
    static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            arr.add(index[i], nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            ans[i] = arr.get(i);            
        }

        return ans;
    }
    public static void main(String[] args) {

        // Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        // Output: [0,4,1,3,2]

        System.out.println(Arrays.toString(createTargetArray(new int[] {0,1,2,3,4}, new int[] {0,1,2,2,1})));
        
    }
    
}
