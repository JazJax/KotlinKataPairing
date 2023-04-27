fun createBox(width: Int, length: Int): Array<IntArray> {
    intArrayOf(width, length) = (1,1)
    return Array(length) { IntArray(width) }
}