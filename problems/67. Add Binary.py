class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i = int(a, 2)
        j = int(b, 2)
        ans = bin(i + j)
        return ans.replace("0b","")
