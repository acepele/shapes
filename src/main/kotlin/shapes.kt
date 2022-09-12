import java.util.*

fun name() {
    println("Enter your selection from the following list: ")
    println("Triangle")
    println("Square")
    println("Rectangle")
    println("Parallelogram")

    val stringInput = readLine()!!
    println("You entered: $stringInput")
}

fun main() {
    name()
    rectangleArea()
    parallelogramArea()
    squareArea()
    ellipseArea()
}

fun rectangleArea() {
        val read = Scanner(System.`in`)

        println("Enter length:")
        val width = read.nextInt()

        println("Enter width:")
        val length = read.nextInt()

        val area = width * length

        println("Area of Rectangle = $area")
    }

fun parallelogramArea() {
    val read = Scanner(System.`in`)

    println("Enter base:")
    val base = read.nextInt()

    println("Enter vertical height:")
    val height = read.nextInt()

    val areaP =  base * height

    println("Area of Parallelogram = $areaP")
}

fun squareArea() {
    val read = Scanner(System.`in`)

    println("Enter length of side:")
    val length = read.nextInt()

    val areaS =  (length)* 2

    println("Area of Square = $areaS")
}

fun ellipseArea() {
    val read = Scanner(System.`in`)

    println("Enter a:")
    val a = read.nextInt()

    println("Enter b:")
    val b = read.nextInt()

    val areaE =  2 * a * b

    println("Area of Square = $areaE")
}











