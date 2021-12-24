package skywolf46.exp4kotlin.function

abstract class Function(val name: String, val reqArguments: Int) {

    constructor(name: String) : this(name, 1)

    abstract fun apply(vararg args: Double)
}