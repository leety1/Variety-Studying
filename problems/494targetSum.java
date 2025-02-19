// https://leetcode.com/problems/target-sum/description/

class Solution{
  public int findTargetSumWays(int[] nums, int target){
    int sum = 0;
    for ( int i : nums) { sum += nums;}
    if ( sum < target || (sum + target) % 2 != 0) { return 0 }
    int targetSum = (sum + target) / 2
    int[] dp = new int[targetSum + 1];
    dp[0] = 1;

    for(int i : nums){
      for(int j = targetSum ; j >= i ; --j){
        dp[j] += dp[j - num];
      }
    }
    return dp[targetSum];
  
    }
  }
