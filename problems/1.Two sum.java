int[] ar = new int[2];
        int sum = 0;
        for(int i = 0; i < nums.length;++i){
            for(int j=i+1;j<nums.length;++j){
                sum = nums[i]+nums[j];
                if(target==sum){
                    ar[0] = i;
                    ar[1] = j;
                }
            }
        }
        return ar;

2 번째
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap();
        int[] rst = new int[2];
        for(int i = 0; i < n; ++i){
            if(map.containsKey(target - nums[i])){
                rst[0] = map.get(target - nums[i]);
                rst[1] = i;
                return rst;
            }
            map.put(nums[i], i);
        }
        return rst;
    }
}
python

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, j in enumerate(nums):
            r = target - j
            if r in d: return [d[r], i]
            d[j] = i
