import java.util.*;

class Solution{
	public List<List<Integer>> threeSum(int[] nums){
		if(nums == null || nums.length<3) return new ArrayList<>();
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();

		for(int i = 0 ; i < nums.length - 2;i++){
			int left = i+1;
			int right = nums.length - 1;
			int sum = 0;
			while(left < right){
				sum = nums[i] + nums[left] + nums[right];
				if(sum == 0){
					result.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					right--;}
				else if(sum > 0){
					right--;}
				else{
					left++;}
			}
		}
		
		return new ArrayList<>(result);
	}	


	public static void main(String[] args){
		Solution sol = new Solution();
		int[] case1 = {2,4,-1,-2,0,-1,1,0,-2};
		System.out.println("test case : "+ sol.threeSum(case1));
	}
}
			

					
				