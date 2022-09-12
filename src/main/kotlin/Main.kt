import java.util.*

class Main {
    fun main() {
        var square : Shape = Square("Square")
        var circle : Shape = Circle("Circle")
        var triangle : Shape = Triangle("Triangle")
        var eqTriangle : Shape = EquilateralTriangle("Equilateral Triangle")

        val reader = Scanner(System.`in`)

        // Square
        print("Enter square length: ")
        val _length = reader.nextDouble()
        print("Enter square height: ")
        val _height = reader.nextDouble()
        square.setDimensions(_length, _height)

        // Circle
        print("Enter circle radius: ")
        val _radius = reader.nextDouble()
        circle.setDimensions(_radius)

        // Triangle
        print("Enter triangle side A: ")
        val _sideA = reader.nextDouble()
        print("Enter triangle side B: ")
        val _sideB = reader.nextDouble()
        print("Enter triangle side C: ")
        val _sideC = reader.nextDouble()
        triangle.setDimensions(_sideA, _sideB, _sideC)

        // Equilateral Triangle
        print("Enter equilateral triangle side: ")
        val _side = reader.nextDouble()
        eqTriangle.setDimensions(_side)

        println(square.name)
        square.printDimensions()
        println("Area: ${square.getArea()}\n")

        println(circle.name)
        circle.printDimensions()
        println("Area: ${circle.getArea()}\n")

        println(triangle.name)
        triangle.printDimensions()
        println("Area: ${triangle.getArea()}\n")

        println(eqTriangle.name)
        eqTriangle.printDimensions()
        println("Area: ${eqTriangle.getArea()}\n")

    }
}