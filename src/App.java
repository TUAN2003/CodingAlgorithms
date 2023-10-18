import java.util.List;

import Number.ThreeSum;

public class App {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> list = threeSum.threeSum(new int[] { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4});
        for (List<Integer> l : list) {
            for (Integer i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        Integer[] ar = { 1, 2, -2, -1 };
        String s = "";
        for (Integer x : ar) {
            s += x.toString();
        }
        System.out.println(s.length());
    }
}