package Number;

public class Sqrt {
    public int mySqrt(int x) {
        int max = 0, comp = 0;
        for (int u = 1; u <= x / 2; u++) {
            max = 2 * u + 1;
            comp = x - (u * u);
            if (comp < max) {
                return u;
            } else if (comp == max) {
                return u + 1;
            }
        }
        return x == 0 ? 0 : 1;
    }
}
