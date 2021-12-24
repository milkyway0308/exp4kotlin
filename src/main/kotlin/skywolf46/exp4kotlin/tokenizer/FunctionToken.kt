package skywolf46.exp4kotlin.tokenizer

import skywolf46.exp4kotlin.constant.TokenType
import skywolf46.exp4kotlin.function.Function

class FunctionToken(val function: Function) : Token(TokenType.TOKEN_FUNCTION)