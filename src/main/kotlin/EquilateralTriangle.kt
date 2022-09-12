import kotlin.math.pow
import kotlin.math.sqrt

class EquilateralTriangle (_name : String) : Triangle(_name) {
    private var _side = 0
    fun setDimensions(_side : Int) {
        this._side = _side
    }

    override fun printDimensions() {
        println("Side: $_side")
    }

    override fun getArea() : Double {
        var s = 0.5 * (_side * 3)
        return sqrt(s * (s - _side).pow(3))
    }
}