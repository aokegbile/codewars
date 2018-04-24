public class JomoPipi{
    public static String antiString(String str){
        StringBuilder resultStringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int value = Character.getNumericValue(str.charAt(i));
            int newCharVal = 0;
            if(value<10 && value >0){
                newCharVal = 10-value;
            }
            else if (Character.isAlphabetic(value) ){
                if(Character.isUpperCase(value)){
                    newCharVal = Character.getNumericValue('Z')-value;
                }
                else newCharVal = Character.getNumericValue('z')-value;
            }
            resultStringBuilder.append(Character.toChars(newCharVal));
        }
        return resultStringBuilder.toString();
        //Coding4life!!!
    }
}