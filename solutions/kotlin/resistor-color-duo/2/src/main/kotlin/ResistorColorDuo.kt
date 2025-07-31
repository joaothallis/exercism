object ResistorColorDuo {
    fun colorCode(input: Color): Int {
        return colors().indexOf(input)
    }

    fun colors(): List<Color> {
        return listOf(
            Color.BLACK,
            Color.BROWN,
            Color.RED,
            Color.ORANGE,
            Color.YELLOW,
            Color.GREEN,
            Color.BLUE,
            Color.VIOLET,
            Color.GREY,
            Color.WHITE
        )
    }
    fun value(vararg colors: Color): Int {
        val two_colors = colors.take(2)
        var codes: String
        codes = ""
        for (i in 0..1) {
            codes = codes + colorCode(two_colors[i])
            println(codes)
        }
        return codes.toInt()
    }
}
