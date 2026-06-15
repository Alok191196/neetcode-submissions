class Solution {

    fun encode(strs: List<String>): String {
        var finalString = ""
        for (str in strs) {
            var temp = ""
            for (s in str) {
                val code = s.code
                temp += "$code-"
            }
            finalString += "$temp|"
        }

        return finalString
    }

    fun decode(str: String): List<String> {
        val strs = str.split("|").dropLast(1)
        val ans = mutableListOf<String>()
        for (s in strs) {
            val message = s.split("-").dropLast(1).map { it.toInt().toChar() }.joinToString("")
            ans.add(message)
        }
        return ans
    }
}
