class Solution:
    def mergeSimilarItems(self, items1: List[List[int]], items2: List[List[int]]) -> List[List[int]]:
        merge = items1 + items2
        d =defaultdict(int)
        for i in merge:
            value, weight = i
            d[value] = d[value] + weight
        rst = []

        for j in sorted(d):
            rst.append([j,d[j]])
        return rst
