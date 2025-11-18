class Matrix(
    private val data: Array<IntArray>,
    private val noOfRow: Int,
    private val noOfCol: Int
) {

    operator fun plus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun times(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(other.noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until noOfCol) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result, noOfRow, other.noOfCol)
    }

    override fun toString(): String {
        val builder = StringBuilder()
        builder.append("($noOfRow x $noOfCol Matrix):\n")
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                builder.append("${data[i][j]} ")
            }
            builder.append("\n")
        }
        return builder.toString()
    }
}
