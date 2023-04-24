import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SampleTest {

    private val testSample: Sample = Sample()

    @Test
    fun `Test Sum Will Add`() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

}