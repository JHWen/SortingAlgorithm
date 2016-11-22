package sorting;

public class InsertionSort {
	/**
	 * 插入排序
	 * 从小到大
	 * @param nums
	 */
	public static void insertionSort(int []nums){
		int n = nums.length;
		int j;
		for (int i = 1; i < n; i++) {
			int temp = nums[i];
			for (j = i - 1; j >= 0 && temp < nums[j] ; j--) {
					nums[j + 1] = nums[j];
			}
			nums[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int nums[]={8,5,2,6,9,3,1,4,0,7};
		insertionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
