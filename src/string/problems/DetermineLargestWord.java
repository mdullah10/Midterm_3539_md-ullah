package string.problems;


public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        String [] word = s.split(" ");
        String maxlethWord = "";
        for(int i = 0; i < word.length; i++){
            if(word[i].length() >= maxlethWord.length()){
                maxlethWord = word[i];
            }
        }
        System.out.println("The length and longest word : "+maxlethWord);

    }
}

