package sorting;

public class QuickSort {

    /**
     * 快速排序 升序排序
     *
     * @param nums
     */
    public static void quickSort(int[] nums) {
        partition(nums, 0, nums.length - 1);
    }

    /**
     * 分治
     *
     * @param left
     * @param right
     * @param array
     */
    public static void partition(int[] array, int left, int right) {
        /*打印输出测试
		for (int item : array) {
			System.out.print(item + " ");
		}
		System.out.println();
		*/
        if (left >= right)
            return;
        int target = array[left];
        int i = left;
        int j = right;
        while (i < j) {
            // 从后向前扫描
            while (i < j && array[j] >= target)
                j--;
            if (array[j] < target) {
                array[i] = array[j];
                i++;
            }
            // 从前往后扫描
            while (i < j && array[i] <= target) {
                i++;
            }
            if (array[i] > target) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = target;
        partition(array, left, i - 1);
        partition(array, i + 1, right);
    }

    public static void main(String[] args) {
        int nums[] = {6, 5, 3, 1, 8, 2, 3, 4, 0};
        quickSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }
}
