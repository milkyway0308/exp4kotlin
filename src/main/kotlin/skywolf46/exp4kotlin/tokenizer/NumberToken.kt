package skywolf46.exp4kotlin.tokenizer

import skywolf46.exp4kotlin.constant.TokenType

class NumberToken(val value: Double) : Token(TokenType.TOKEN_NUMBER) {
    internal constructor(expr: CharArray, offset: Int, len: Int)
            : this(String(expr, offset, len).toDouble())
}