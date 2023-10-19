package Number;

public class ReverseInteger {
    public int Reverse(int x) {
        int r = 0;
        while (x >= 10 || x <= -10) {
            r = r * 10 + (x % 10);
            x /= 10;
        }
        if (r <= Integer.MAX_VALUE / 10 && r >= Integer.MIN_VALUE / 10) {
                return r = r * 10 + (x % 10);
        }
        return 0;
    }
}
