class Square (_name : String) : Shape(_name) {
    private var _length = 0.0
    private var _height = 0.0
    fun setDimensions(_length : Double, _height : Double) {
        this._length = _length
        this._height = _height
    }

    override fun printDimensions() {
        println("Length $_length")
        println("Height $_height")
    }

    override fun getArea() : Double {
        return _length * _height
    }
}