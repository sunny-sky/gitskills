package 三数和最近;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Solution1 {
    public static int threeSumClosest(int[] nums, int target){

        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int current = nums[left] + nums[right] + nums[i];
                if(abs(target - current) < abs(target - sum))
                {
                    sum = current;
                    if(sum == target)
                        return sum;
                }
                if(current > target)
                    right --;
                else
                    left ++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums ={-1,2,1,-4};
        int target = 1;
        int result = threeSumClosest(nums,target);
        System.out.println(result);
    }
}
