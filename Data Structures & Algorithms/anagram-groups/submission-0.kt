class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return anagramGrouper(strs)
    }

     fun anagramGrouper(anagrams: Array<String>) :  List<List<String>> {
        val finalHashmap = HashMap<HashMap<Char, Int>, MutableList<String>>()

        for ( anagram in anagrams) {
            val anagramMap = anagramHashmap(anagram)
            if (!finalHashmap.containsKey(anagramMap)) {
                finalHashmap[anagramMap] = mutableListOf()
            }
            finalHashmap[anagramMap]?.add(anagram)
        }

        return finalHashmap.values.toList()
    }

    fun anagramHashmap(str: String): HashMap<Char, Int> {
        val sMap = HashMap<Char, Int>()
        for (s in str) {
            sMap[s] = sMap.getOrDefault(s, 0) + 1
        }
        return sMap
    }


}
