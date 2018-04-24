public class Dioph {
    public static String solEquaStr(long n) {
        StringBuilder resultStringBuilder =  new StringBuilder().append('[');
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(n == i*i -(4*j*j)){
                    resultStringBuilder.append("[").append(i).append(", ").append(j).append(']');
                }
            }
        }
        return resultStringBuilder.append(']').toString();
    }
}