class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var prod = 1
        var zeroCount = 0

        for (num in nums) {
            if (num != 0) {
                prod *= num
            } else {
                zeroCount++
            }
        }

        val res = IntArray(nums.size)
        if (zeroCount > 1) return res

        for (i in nums.indices) {
            res[i] = if (zeroCount > 0) {
                if (nums[i] == 0) prod else 0
            } else {
                prod / nums[i]
            }
        }
        return res
    }
}