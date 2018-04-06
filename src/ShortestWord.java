public class ShortestWord {
    public static int findShort(String s) {
        int shortest=0;
        String[] arr = s.split(" ");
        for(int i = 0; i<arr.length;i++){
            int strLength = arr[i].length();
            if (shortest==0){ shortest = strLength;}
            else if(strLength<shortest){ shortest = strLength;}
        }
        return shortest;
    }
}
