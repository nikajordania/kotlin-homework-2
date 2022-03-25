import kotlin.math.sqrt

class Point(private var x: Int, private var y: Int) {
    override fun toString(): String {
        return "point(x: $x, y: $y)"
    }

    override fun equals(other: Any?): Boolean {
        other as Point
        if (x == other.x && y == other.y) return true

        return false
    }

    fun invert() {
        x = -x
        y = -y
    }

    fun distance(point: Point): Double {
        return sqrt(((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y)).toDouble())
    }
}