object Pangram {

    fun isPangram(input: String): Boolean {
        var chars_of_alphabeth = 0
        // if (input == "abcdefghijklmnopqrstuvwxyz") {
        //     return true
        // }
        // return false
        for (i in 97..122) {
            for (char_index in 0..input.length - 1) {
                if (input[char_index].lowercaseChar().code == i) {
                    chars_of_alphabeth = chars_of_alphabeth + 1
		    break
                }
            }
        }
	if (chars_of_alphabeth == 26) {return true}
	return false
    }
}
