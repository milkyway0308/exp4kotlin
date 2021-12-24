package skywolf46.exp4kotlin.tokenizer

import java.util.*

class VariableToken(capacity: Int) {
    private var data: DoubleArray
    private var index = 0

    init {
        data = DoubleArray(capacity)
        index = -1
    }

    constructor() : this(5)

    fun push(value: Double) {
        if (index + 1 == data.size) {
            val temp = DoubleArray((data.size * 1.2).toInt() + 1)
            System.arraycopy(data, 0, temp, 0, data.size)
            data = temp
        }
        data[++index] = value
    }

    fun peek() : Double {
        if (index == -1) {
            throw EmptyStackException()
        }
        return data[index]
    }

    fun pop(): Double {
        if (index == -1) {
            throw EmptyStackException()
        }
        return data[index--]
    }

    fun isEmpty(): Boolean {
        return index == -1
    }

    fun size(): Int {
        return index + 1
    }

}