public class Ch04 {

    static int sum(int[] arr){
        int sum=0;

        for(int i : arr){
            sum+=i;
        }

        return sum;
    }

    static int solution(int[][] accounts) {
        int max = 0;

        for(int[] i : accounts){
            if(sum(i)> max) max = sum(i);
        }

        return max;
    }

    public static void main(String[] args) {

        // Input: accounts = [[1,2,3],[3,2,1]]
        // Output: 6

        System.out.println(solution(new int[][] {{1,2,3},{3,2,1}}));
        
    }
    
}
