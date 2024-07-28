// 1512. Number of Good Pairs

public class Ch07 {

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        // Input: nums = [1,2,3,1,1,3]
        // Output: 4

        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
        
    }
    
}
