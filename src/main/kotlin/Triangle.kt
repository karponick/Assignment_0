import kotlin.math.sqrt

open class Triangle (_name : String) : Shape(_name) {
    private var _sideA = 0
    private var _sideB = 0
    private var _sideC = 0
    fun setDimensions(_sideA : Int, _sideB : Int, _sideC : Int) {
        this._sideA = _sideA
        this._sideB = _sideB
        this._sideC = _sideC
    }

    override fun printDimensions() {
        println("Side A: $_sideA")
        println("Side B: $_sideB")
        println("Side C: $_sideC")
    }

    override fun getArea() : Double {
        var s = 0.5 * (_sideA + _sideB + _sideC)
        return sqrt(s * (s - _sideA) * (s - _sideB) * (s - _sideC))
    }
}