// LeetCode 39: Combination Sum
// 回溯搜尋所有組合
import java.util.*;

class lt_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) continue;
            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, path, res); // 可重複使用
            path.remove(path.size() - 1);
        }
    }
}
