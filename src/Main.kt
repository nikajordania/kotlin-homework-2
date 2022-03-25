fun main() {
    val p1 = Point(0, 5)
    val p2 = Point(0, 5)
    val p3 = Point(3, 7)
    val p4 = Point(1, 15)

    println("The classes $p1 and $p2 are equal:  " + p1.equals(p2))
    println("The classes $p1 and $p3 are equal:  " + p1.equals(p3))

    println(p1.toString())
    p1.invert()
    println(p1.toString())

    println("Distance between $p1, $p3 = " + p1.distance(p3))
    println("Distance between $p3, $p4 = " + p3.distance(p4))
}