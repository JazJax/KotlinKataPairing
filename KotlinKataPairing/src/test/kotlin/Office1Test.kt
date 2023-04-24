import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Office1Test {
    //    private val testSample: Offi = Sample()
    //    fun outed(meet: Map<String, Int>, boss: String): String {
    @Test
    fun `outed should return Get Out Now! when happiness bellow 5`() {
        val meet = mapOf("" to 0)
        val result = outed(meet, "")
        assertEquals("Get Out Now!",result)
    }
}