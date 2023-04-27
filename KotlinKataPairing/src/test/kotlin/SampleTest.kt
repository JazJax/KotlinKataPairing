
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

internal class SampleTest {

    private val testSample: Sample = Sample()

    @Test
    fun `Test Sum Will Add`() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

}