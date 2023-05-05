import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

internal class PreviousMultipleThreeKtTest {
    @Test
    fun `should return the same number when it has 1 digit and multiple of 3`() {
        val expected = 9
        val result = prevMultOfThree(9)
        assertEquals(expected, result)
    }

    @Test
    fun `should return null when it has 1 digit and not multiple of 3`() {
        val expected = null
        val result = prevMultOfThree(8)
        assertEquals(expected, result)
    }

    @Test
    fun `should return the same number when it has more than 1 digit and multiple of 3`() {
        val expected = 36
        val result = prevMultOfThree(36)
        assertEquals(expected, result)
    }

    @Test
    fun `should return a new number when number not multiple of 3 but new number multiple of 3`() {
        val expected = 36
        val result = prevMultOfThree(362)
        assertEquals(expected, result)
    }

    @Test
    fun `should return null when number not multiple of 3 and all new numbers not multiple of 3`() {
        val expected = null
        val result = prevMultOfThree(251)
        assertEquals(expected, result)
    }

}