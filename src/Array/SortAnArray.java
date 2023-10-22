package Array;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums);
        return nums;
    }

    // QUICK SORT
    public void quickSort(int[] nums) {
        if (nums != null)
            quickSortRange(nums, 0, nums.length - 1);
    }

    public void quickSortRange(int[] nums, int begin, int end) {
        if (begin < end) {
            int pos = partition(nums, begin, end);
            quickSortRange(nums, begin, pos - 1);
            quickSortRange(nums, pos + 1, end);
        }
    }

    public int partition(int[] nums, int begin, int end) {
        int indexPivot = begin;
        int pivot = nums[indexPivot];
        while (begin < end) {
            while (begin < end && pivot >= nums[end])
                end--;
            while (begin < end && pivot <= nums[begin])
                begin++;
            swap(nums, begin, end);
        }
        swap(nums, indexPivot, end);
        return end;
    }

    // MERGE SORT
    public void mergeSort(int[] nums) {
        if (nums != null)
            mergeSortRange(nums, 0, nums.length - 1);
    }

    public void mergeSortRange(int[] nums, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSortRange(nums, beg, mid);
            mergeSortRange(nums, mid + 1, end);
            merge(nums, beg, mid, end);
        }
    }

    public void merge(int[] nums, int beg, int mid, int end) {
        int cLeft = beg;
        int cRight = mid + 1;
        int count = 0;
        int[] temp = new int[end - beg + 1];
        while (cLeft <= mid && cRight <= end) {
            if (nums[cLeft] < nums[cRight]) {
                temp[count] = nums[cLeft];
                cLeft++;
            } else {
                temp[count] = nums[cRight];
                cRight++;
            }
            count++;
        }
        while (cLeft <= mid) {
            temp[count] = nums[cLeft];
            cLeft++;
            count++;
        }
        while (cRight <= end) {
            temp[count] = nums[cRight];
            cRight++;
            count++;
        }
        for (int x : temp) {
            nums[beg] = x;
            beg++;
        }
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
