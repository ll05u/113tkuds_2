class lt_34 {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findLeft(nums, target), findRight(nums, target)};
    }
    private int findLeft(int[] nums, int target) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target) r = mid - 1;
            else l = mid + 1;
            if (nums[mid] == target) res = mid;
        }
        return res;
    }
    private int findRight(int[] nums, int target) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= target) l = mid + 1;
            else r = mid - 1;
            if (nums[mid] == target) res = mid;
        }
        return res;
    }
}
