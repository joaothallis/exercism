object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        val lower_cased_letter = c.lowercaseChar()
        if (lower_cased_letter in "aeioulnrst".toCharArray()) {
            return 1
        }
        if (lower_cased_letter in "dg".toCharArray()) {
            return 2
        }
        if (lower_cased_letter in "bcmp".toCharArray()) {
            return 3
        }
        if (lower_cased_letter in "fhvwy".toCharArray()) {
            return 4
        }
        if (lower_cased_letter in "k".toCharArray()) {
            return 5
        }
        if (lower_cased_letter in "jx".toCharArray()) {
            return 8
        }
        if (lower_cased_letter in "qz".toCharArray()) {
            return 10
        }
        if (lower_cased_letter in "qz".toCharArray()) {
            return 10
        }
        return 0
    }

    fun scoreWord(word: String): Int {
        var score = 0
        for (i in 0..word.length - 1) {
            score = score+scoreLetter(word[i])
        }
        return score
    }
}
