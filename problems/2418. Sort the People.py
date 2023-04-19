class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        rst = []
        for i in sorted(heights)[::-1]:
            rst.append(names[heights.index(i)])
        return rst
