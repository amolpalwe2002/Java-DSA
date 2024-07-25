import java.util.Arrays;

public class Ch05 {

    static int[] solution(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int i=0;
        int index =0;
        int j=n;
        while(i<n){
            ans[index] = nums[i];
            ans[index+1] = nums[j];
            i++;
            index+=2;
            j++;
        }

        // for(int i=0; i<n; i++){
        //     ans[2*i] = nums[i];
        //     ans[(2*i)+1] = nums[n+i];
        // }

        return ans;
        
    }

    public static void main(String[] args) {

        // Input: nums = [2,5,1,3,4,7], n = 3
        // Output: [2,3,5,4,1,7] 

        System.out.println(Arrays.toString(solution(new int[] {2,5,1,3,4,7}, 3)));
        
    }
    
}
