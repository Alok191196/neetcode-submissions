class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        for (i in nums.indices) {
            if (map.containsValue(target - nums[i])) 
                return intArrayOf(map.entries.find { it.value == (target - nums[i])}!!.key, i)
            map[i] = nums[i]
        }
        return intArrayOf()
    }
}
