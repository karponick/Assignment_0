import kotlin.math.PI

class Circle (_name : String) : Shape(_name) {
    private var _radius = 0
    fun setDimensions(_radius : Int) {
        this._radius = _radius
    }

    override fun printDimensions() {
        println("Radius $_radius")
    }

    override fun getArea() : Double {
        return PI * _radius * _radius
    }
}