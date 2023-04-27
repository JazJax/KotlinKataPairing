import org.testng.annotations.Test
import org.testng.Assert.assertEquals

internal class SpiralingBoxKtTest {

    @Test
    fun `Test the width and height are equal 0`() {
        val expected = intArrayOf()
        assertEquals(expected, createBox(0, 0))
    }

    @Test
    fun `Test the width and height are equal 1`() {
        val expected = arrayOf(intArrayOf(1))
        assertEquals(expected, createBox(1, 1))
    }

    @Test
    fun `Test the width and height are equal 2`() {
        val expected = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1)
        )

        assertEquals(expected, createBox(2, 2))
    }

    @Test
    fun `Test the width and height are equal 7 and 8`() {
        val expected = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1),
            intArrayOf(1, 2, 2, 2, 2, 2, 1),
            intArrayOf(1, 2, 3, 3, 3, 2, 1),
            intArrayOf(1, 2, 3, 4, 3, 2, 1),
            intArrayOf(1, 2, 3, 4, 3, 2, 1),
            intArrayOf(1, 2, 3, 3, 3, 2, 1),
            intArrayOf(1, 2, 2, 2, 2, 2, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 1)
        )
        assertEquals(expected, createBox(7, 8))
    }
}
