package com.oops.test1;

public class Test2 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		Test1 test1 = new Test1();
		test1.test(nums);
		for(int j = 0;j<nums.length;j++){
			System.out.println(nums[j]);
		}
	}
}

