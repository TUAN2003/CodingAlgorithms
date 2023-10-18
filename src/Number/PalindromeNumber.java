package Number;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        } else if (0 <= x && x <= 9) {
            return true;
        }
        int tmp1 = x, tmp2 = 0;
        while (tmp1 != 0) {
            tmp2 = tmp2 * 10 + tmp1 % 10;
            tmp1 = tmp1 / 10;
        }
        return x == tmp2;
    }
}
