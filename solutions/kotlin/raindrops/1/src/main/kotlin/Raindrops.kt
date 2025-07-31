object Raindrops {

    fun convert(n: Int): String {
        var result = ""
        if (n % 3 == 0) {
            result = "Pling"
        }
        if (n % 5 == 0) {
            result = result + "Plang"
        }
        if (n % 7 == 0) {
            result = result + "Plong"
        }
        if (result == "") {
            result = "$n"
        }
        return result
    }
}
