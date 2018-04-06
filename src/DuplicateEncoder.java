public class DuplicateEncoder {
  static String encode(String word) {
    word = word.toLowerCase();
    StringBuffer out = new StringBuffer();
    for(char c : word.toCharArray()) {
      out.append(word.length() - word.replace("" + c, "").length() > 1 ? ')' : '(');
    }
    return out.toString();
  }
} 
