package Array;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, count = 0;
        int size = nums1.length + nums2.length;
        int[] a = new int[size];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                a[count] = nums2[j];
                count++;
                j++;
            } else {
                a[count] = nums1[i];
                count++;
                i++;
            }
        }
        for (; j < nums2.length; j++, count++) {
            a[count] = nums2[j];
        }
        for (; i < nums1.length; i++, count++) {
            a[count] = nums1[i];
        }
        return (size) % 2 == 1 ? a[(int) (size) / 2]
                : (double) (a[(size) / 2] + a[(size) / 2 - 1]) / 2;
    }
}
