package Array;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums);
        return nums;
    }

    public void quickSort(int[] nums) {
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

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
