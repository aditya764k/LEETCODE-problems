import java.util.Arrays;

class Solution{
	public void sortColors(int[] nums){
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		while(mid<=high){
			if(nums[mid] == 0){
				swap(nums,low,mid);
				low++;
				mid++;}
			else if(nums[mid] == 1){
				mid++;}
			else{
				swap(nums, mid,high);
				high--;}
		}
	}
	
  	public void swap(int[] nums, int x ,int  y){
		int temp = 0;
		temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
		}

	public static void main ( String[] args){
		Solution sol = new Solution();
		int[] case1 = {2,0,2,1,1,0};
		sol.sortColors(case1);
		System.out.println("Test1 : "+ Arrays.toString(case1));
	}
}
	
				
		
				