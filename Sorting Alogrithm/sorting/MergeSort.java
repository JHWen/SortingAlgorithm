package sorting;

public class MergeSort {
    /**
     * 归并排序
     * 升序
     *
     * @param nums
     */
    public static void mergeSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    /**
     * 递归分解数组
     *
     * @param nums
     * @param low
     * @param high
     */
    public static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, mid, high);
//        for (int item : nums) { // 显示每次合并数组的结果
//            System.out.print(item + " ");
//        }
//        System.out.println();
    }

    /**
     * 合并数组
     *
     * @param nums
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[nums.length];
        // 把数组nums当前合并部分复制到临时数组对应位置
        for (int k = low; k <= high; k++) {
            temp[k] = nums[k];
        }
        int i = low; // 第一个合并数组的起点
        int j = mid + 1;// 第二个合并数组的起点
        // 合并并排序
        for (int k = low; k <= high; k++) {
            // k为当前位置
            if (i > mid) {
                // 左边数组为空
                nums[k] = temp[j];
                j++;
            } else if (j > high) {
                // 右边数组为空
                nums[k] = temp[i];
                i++;
            } else if (temp[i] > temp[j]) {
                // 左边元素大于右边元素，插入右边元素
                nums[k] = temp[j];
                j++;
            } else {
                // 左边元素小于右边元素，插入左边
                nums[k] = temp[i];
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        mergeSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
