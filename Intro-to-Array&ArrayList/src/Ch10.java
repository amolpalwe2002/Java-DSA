// 1832. Check if the Sentence Is Pangram

public class Ch10 {

    static boolean solution(String sentence){
        boolean flag = false;
        if(sentence.length()>=26){
            for(int i=97; i<123; i++){
                String item = (char)(i)+"";
                if(sentence.contains(item)) flag=true;
                else {
                    return false;
                };
            }

            return flag;
        }

        return false;

    }
    public static void main(String[] args) {
        
        // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        // Output: true
        // Explanation: sentence contains at least one of every letter of the English alphabet.

        System.out.println(solution("thequickbrownfoxjumpsoverthelazydog"));
    }
    
}
