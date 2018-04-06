import java.util.HashMap;

public class FindOdd {
    public static int findIt(int[] arr) {
        int odd = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int anArr : arr) {
            if (null == map.get(anArr)) {
                map.put(anArr, 1);
            } else {
                Integer put = map.get(anArr);
                map.remove(anArr);
                map.put(anArr, put + 1);
            }
        }
        for(HashMap.Entry<Integer,Integer>pair:map.entrySet()){
            if(pair.getValue()%2!=0){
                return pair.getKey();
            }
        }
        return odd;
    }
}