package skywolf46.exp4kotlin.tokenizer

class UnknownFunctionOrVariableException(
    val expression: String,
    val position: Int,
    length: Int,
) : IllegalArgumentException(
    "Unknown function or variable '${
        token(expression,
            position,
            length)
    }' at pos $position in expression '$expression'"
) {
    companion object {
        fun token(expression: String, position: Int, length: Int): String {
            val len = expression.length;
            var end = position + length - 1
            if (len < end) {
                end = len
            }
            return expression.substring(position, end)
        }
    }
}