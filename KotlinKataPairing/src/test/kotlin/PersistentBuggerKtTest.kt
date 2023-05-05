import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

internal class PersistentBuggerKtTest{
    @Test
    fun `should return 0 when number has 1 digit`() {
        val expected = 0
        val result = persistence(9)
        assertEquals(expected, result)
    }

    @Test
    fun `should return 2 when multiply has to done for 2 times`() {
        val expected = 2
        val result = persistence(25)
        assertEquals(expected, result)
    }

    @Test
    fun `should return 3 when multiply has to done for 3 times`() {
        val expected = 3
        val result = persistence(39)
        assertEquals(expected, result)
    }

    @Test
    fun `should return 4 when multiply has to done for 4 times`() {
        val expected = 4
        val result = persistence(999)
        assertEquals(expected, result)
    }
}