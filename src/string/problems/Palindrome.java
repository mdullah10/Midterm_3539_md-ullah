package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String pal = "MADAM";
        int startPos=0;
        int endPos = pal.length() -1;
        boolean isPal = true;
        while (startPos<endPos){
            String startLetter = pal.substring(startPos,startPos+1);
            String endLetter = pal.substring(endPos, endPos+1);

            if (startLetter.equals(endLetter)==false){
                isPal=false;
                break;
            }
            startPos++;
            endPos--;
        }
            if (isPal==true){
                System.out.println(pal+ " is Palindrom");
            }else {
                System.out.println(pal+ " is not palindrom");
            }

    }
}
