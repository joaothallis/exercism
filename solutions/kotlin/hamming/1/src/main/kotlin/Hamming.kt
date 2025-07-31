object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length == rightStrand.length) {
            var hamming_distance = 0
            for (i in 0..leftStrand.length - 1) {
                if (leftStrand[i] != rightStrand[i]) {
                    hamming_distance = hamming_distance + 1
                }
            }

            return hamming_distance
        } else {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
    }
}
