class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            map[nums[i]] = map.getOrDefault(nums[i],  0) + 1
            if (map.getOrDefault(nums[i],  0) > 1) {
                return true
            }
        }
        return false

    }
}
