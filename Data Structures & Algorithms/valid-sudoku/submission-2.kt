class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // check row
        for (arr in board) {
            if (!isValidRC(arr)) return false
        }

        // check Column
        for (i in 0 .. 8) {
            var temp = CharArray(9)
            for (j in 0 .. 8) {
                temp[j] = board[j][i]
            }
            if (!isValidRC(temp)) return false
            temp = CharArray(9)
        } 

        // check Box
        for (i in 0 .. 8 step 3) {
            // box start position (0,0) (0,3) (0,6)
            // (3,0) (3,3) (3,6)
            // (6,0) (6,3) (6,6)
            for (j in 0..8 step 3) {
                val tempArr = getTempSubBox(i, j, board)
                if (!isValidRC(tempArr)) return false
            }
        }

        return true
    }

    fun getTempSubBox(row: Int, col: Int, board: Array<CharArray>) : CharArray {
        val temp = CharArray(9)
        var counter = 0
        for (i in row .. row + 2) {
            for (j in col .. col + 2) {
                temp[counter] = board[i][j]
                counter++
            }
        }
        return temp
    }

    fun isValidRC(arrs: CharArray) : Boolean {
        val seen = HashSet<Char>()
        for (char in arrs) {
            if (char != '.') {
                if (char in seen) return false
                seen.add(char)
            }
        }
        return true
    }

}
