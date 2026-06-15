class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefixMul = IntArray(nums.size)

        val n = nums.size
        val res = IntArray(n)

        for (i in 0 until n) {
            var prod = 1
            for (j in 0 until n) {
                if (i == j) continue
                prod *= nums[j]
            }
            res[i] = prod
        }
        return res
    }
}
