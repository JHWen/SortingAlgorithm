public class BasicsSort {
	/**
	 * ð������
	 * 
	 * @param nums
	 */
	public static void BubbleSort(int[] nums) {
		
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
		SelectionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
