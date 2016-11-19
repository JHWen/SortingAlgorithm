public class BasicsSort {
	/**
	 * ð������
	 * ��С����
	 * @param nums
	 */
	public static void BubbleSort(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
	}
	/**
	 * �Ľ���ð������
	 * ����һ��flag��־���ж��������
	 * ��������ִ����
	 * @param nums
	 */
	public static void BubbleSortImprove(int[] nums) {

	}

	/**
	 * ѡ������  
	 * ��С��������
	 * @param nums
	 */
	public static void SelectionSort(int[] nums) {
		int n = nums.length;
		int temp;// ��ʱ����
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int nums[]={8,5,2,6,9,3,1,4,0,7};
//		SelectionSort(nums);
		BubbleSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
