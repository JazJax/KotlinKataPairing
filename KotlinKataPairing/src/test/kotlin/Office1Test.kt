import org.junit.jupiter.api.Assertions.*
import org.testng.annotations.Test

internal class Office1Test {
//    private val testSample: Office1Test = Office1Test()
    //    fun outed(meet: Map<String, Int>, boss: String): String {
    @Test
    fun `outed should return Get Out Now! when happiness is empty`() {
        val meet = mapOf("" to 0)
        val result = outed(meet, "")
        assertEquals("Get Out Now!",result)
    }

    @Test
    fun `outed should return Nice Work Champ! when happiness is 5 or greater than 5`() {
        val meet = mapOf("" to 5)
        val result = outed(meet, "")
        assertEquals("Nice Work Champ!",result)
    }

    @Test
    fun `get list of people outed should return Nice Work Champ! when happiness is 5 or greater than 5`() {
        val meet = mapOf("Jasper" to 5, "Danny" to 6)
        val result = outed(meet, "Jasper")
        assertEquals("Nice Work Champ!",result)
    }

    @Test
    fun `get list of people outed should return Nice Work Champ! when happiness is 5 and boss happiness is below 5`() {
        val meet = mapOf("Jasper" to 6, "Danny" to 6, "Pedro" to 4)
        val result = outed(meet, "Pedro")
        assertEquals("Nice Work Champ!",result)
    }

    @Test
    fun `get list of people outed should return Get Out Now! when happiness is below 5 and boss happiness is below 5`() {
        val meet = mapOf("Jasper" to 2, "Danny" to 4, "Pedro" to 4)
        val result = outed(meet, "Pedro")
        assertEquals("Get Out Now!",result)
    }

    @Test
    fun `get list of people outed should return Get Out Now! when happiness is below 5 and boss happiness is greater than 5`() {
        val meet = mapOf("Jasper" to 1, "Danny" to 2, "Pedro" to 5)
        val result = outed(meet, "Pedro")
        assertEquals("Get Out Now!",result)
    }

}