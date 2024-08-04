package NumbersBased;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
/*
 * Given an array A[] of n numbers and another number x, 
 * the task is to check whether or not there exist two elements in A[] 
 * whose sum is exactly x. 
 */
	public static void main(String[] args) {
		int[] num = { 2, 7, 11, 15 };
		//int[] output = new int[2];
		int target = 26;
		TwoSumProblem tsp=new TwoSumProblem();
		System.out.println(Arrays.toString(tsp.twoSum(num, target)));
		System.out.println(Arrays.toString(tsp.twoSumHashMap(num, target)));
	}
		public int[] twoSum(int[] num,int target) { //O(n^2)
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++)
            if (num[i] + num[j] == target) {
				return new int[] {i,j};	
				}}
		
	throw new IllegalArgumentException("No such numbers found");
		
		
	}

//*****************************2nd Approach ***************

public int[] twoSumHashMap(int[] num,int target) { 
	HashMap<Integer, Integer> input=new HashMap<Integer, Integer>();
	int secondNumber;
	for (int i = 0; i < num.length; i++) {
		input.put(num[i], i); }
	for (int i = 0; i < num.length; i++) {
		secondNumber=target-num[i]; 
	if(input.containsKey(secondNumber)) {
		return new int[] {i,input.get(secondNumber)};
	}}
	
	
	
throw new IllegalArgumentException("No such numbers found");
	
}
}