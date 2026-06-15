class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false

        val sMap = HashMap<Char, Int>()
        val tMap = HashMap<Char, Int>()


        for (str in s) {
            sMap[str] = sMap.getOrDefault(str, 0) + 1
        }

        for (str in t) {
            tMap[str] = tMap.getOrDefault(str, 0) + 1
        }

        return sMap == tMap
    }
}
