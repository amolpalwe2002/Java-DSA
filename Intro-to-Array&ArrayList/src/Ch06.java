// 1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.List;

public class Ch06 {

    static int max(int[] arr){
        int res = Integer.MIN_VALUE;

        for(int i : arr){
            if(i>res) res = i;
        }

        return res;
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = max(candies);
        // System.out.println(max);
        for(int i=0; i<candies.length; i++){
            ans.add((candies[i]+extraCandies) >= max);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        // Input: candies = [2,3,5,1,3], extraCandies = 3
        // Output: [true,true,true,false,true]
        

        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3));
    }
    
}
