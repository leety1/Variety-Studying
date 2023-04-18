class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        def dfs(i, path, current_target):
            if(current_target == 0):
                ans.append(path[:])
            else:
                for j in range(i, len(candidates)):
                    if(j != i and candidates[j-1] == candidates[j]):
                        continue
                    if(current_target < candidates[j]):
                        break
                    dfs(j+1, path + [candidates[j]], current_target - candidates[j])
        ans = []
        candidates.sort()
        dfs(0, [], target)
        return ans
