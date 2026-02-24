
import java.util.Arrays;

class Solution{
	public int[] twoSum(int[] numbers,int target){
		int start = 0;
		int end = numbers.length -1 ;
		int sum = 0;
		while(start<end){
			sum = numbers[start] + numbers[end];
			if(sum == target){
				return new int[] {start+1,end+1};
			}
			else if(sum>target){
				end--;}
			else{
				start++;}
		} 
		return new int[]{};
}


public static void main(String[] args){
	Solution sol = new Solution();
	int[] case1 ={2,7,11,15};
	int target = 9;
	System.out.println("Test 1:"+ Arrays.toString(sol.twoSum(case1,target)));
}
}