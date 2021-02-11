public class StringFunctions {
    public String reverse(String str) {           // Reverse the string
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public int size(String str) {              // return the size of string
        return str.length();
    }
}
