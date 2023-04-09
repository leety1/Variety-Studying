class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums, target, 0, 0, 0);
    }
    public int dfs(int[] nums, int target, int idx, int cnt, int sum){
        if(nums.length == idx){
            if(sum == target) cnt++;
            return cnt;
        }

        int pos = dfs(nums, target, idx + 1, cnt, sum + nums[idx]);
        int neg = dfs(nums, target, idx + 1, cnt, sum - nums[idx]);
        return pos + neg;
    }
}


/// 2 방법

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap();
        dp.put(0, 1);
        for (int num : nums) {
            Map<Integer, Integer> dp2 = new HashMap();
            for (int tempSum : dp.keySet()) {
                int key1 = tempSum + num;
                dp2.put(key1, dp2.getOrDefault(key1, 0) + dp.get(tempSum));
                int key2 = tempSum - num;
                dp2.put(key2, dp2.getOrDefault(key2, 0) + dp.get(tempSum));
            }
            dp = dp2;
        }
        return dp.getOrDefault(target, 0);
    }
}


/// python
class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        memo = {}
        def targetSum(arr, target, n):
            if(target, n) in memo :
                return memo[(target, n)]
            if target == 0 and n == 0:
                return 1
            if n == 0:
                return 0
            positive = targetSum(arr, target - arr[n - 1], n - 1)
            negative = targetSum(arr, target + arr[n - 1], n - 1)

            memo[(target, n)] = positive + negative
            return positive + negative
        answer = targetSum(nums, target, len(nums))
        return answer
