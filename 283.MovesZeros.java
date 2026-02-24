import java.util.Arrays;
class Solution{
	public void moveZeros(int[] nums){
		int low = 0;
		int high = 0;
		
		while(high <= nums.length-1){
			if(nums[high] != 0){		
				swap(nums,low,high);
				low++;
				high++; }
			else{
				high++;}
		}
	}
	public void swap(int[] nums, int num1,int num2){
		int temp = 0;
		temp = nums[num1];
		nums[num1] = nums[num2];
		nums[num2] = temp;
	}

	public static void main(String[] args){
		Solution sol = new Solution();
		int[] case1 = {2,0,0,2,1,0,3,2};
		sol.moveZeros(case1);
		System.out.println("Test 1 : "+ Arrays.toString(case1));
	}
}			