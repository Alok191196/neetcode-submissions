class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = HashMap<Int, Int>()

        for (num in nums) {
            freq[num] = freq.getOrDefault(num, 0) + 1
        }
        return freq.entries.sortedBy { it.value }.takeLast(k).map { it.key }.toIntArray()
    }
}
