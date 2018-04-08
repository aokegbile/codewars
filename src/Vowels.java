public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowel= "aeiou";
        for (int i = 0; i <str.length() ; i++) {
            if(vowel.indexOf(str.charAt(i))>-1){
             vowelsCount++;
            }
        }
        // your code here
        return vowelsCount;
    }

}