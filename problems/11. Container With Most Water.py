class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right, ans = 0, len(height) - 1, 0

        while left <= right:
            area = min(height[right], height[left])*(right - left)
            ans = max(ans, area)
            if height[right] > height[left] :
                left += 1
            else :
                right -= 1
        return ans
