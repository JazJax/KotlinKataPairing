import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

internal class EvenNumbersInArrayKtTest {
    @Test
    fun `evenNumbers should return a new array of length number containing the last even number when nubmer is 1`() {
        val expected = listOf(8)
        val result = evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 1)
        assertEquals(expected, result)
    }
    @Test
    fun `evenNumbers should return a new array of length number containing the last even number when nubmer is 3`() {
        val expected = listOf(4, 6, 8)
        val result = evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3)
        assertEquals(expected, result)
    }

    @Test
    fun `evenNumbers should return a new array of length number containing the last even number when negative numbers exist`() {
        val expected = listOf(-8, 26)
        val result = evenNumbers(listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26), 2)
        assertEquals(expected, result)
    }
}