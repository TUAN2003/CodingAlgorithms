package AlgorString;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String res = "";
        int endIndex = s.length() - 1;
        int max = 0;
        char c;
        int length;
        for (int j = 0; j <= endIndex; j++) {
            c = s.charAt(j);
            for (int i = endIndex; i >= j; i--) {
                while (i >= j && c != s.charAt(i)) {
                    i--;
                }
                length = i - j + 1;
                if (length > max) {
                    if (isPalindrome(s, j, i)) {
                        res = s.substring(j, j + length);
                        max = length;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(String s, int startIndex, int endIndex) {
        boolean b = true;
        int bound = (startIndex + endIndex + 1) / 2;
        for (int j = startIndex; j < bound; j++, endIndex--) {
            if (s.charAt(j) != s.charAt(endIndex)) {
                b = false;
                break;
            }
        }
        return b;
    }
}
