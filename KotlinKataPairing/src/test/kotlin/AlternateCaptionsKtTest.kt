import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

internal class AlternateCaptionsKtTest {
    @Test
    fun `capitalize should capitalize odd and even letters into different lists`() {
        val expected = listOf("AbCdEf", "aBcDeF")
        val result = capitalize("abcdef")
        assertEquals(expected, result)
    }

    @Test
    fun `IsEven should return true when the number recieved is even`() {
        val expected = true;
        val result = isEven(2);
        assertEquals(expected, result);
    }

    @Test
    fun `IsEven should return false when the number recieved is odd`() {
        val expected = false;
        val result = isEven(1);
        assertEquals(expected, result);
    }
}