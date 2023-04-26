import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AlphabetWarKtTest{
    @Test
    fun `Should return Right side wins! when right side stronger than left side`() {
        val expected =alphabetWar("zzzzsm")
        assertEquals("Right side wins!", expected)
    }

    @Test
    fun `Should return Left side wins! when right side weaker than left side`() {
        val expected =alphabetWar("wwwwwwmm")
        assertEquals("Left side wins!", expected)
    }

    @Test
    fun `Should return Let's fight again! when right side strength is equals to left side`() {
        val expected =alphabetWar("wmqpqpqpwwmm")
        assertEquals("Let's fight again!", expected)
    }
    @Test
    fun `Should return Let's fight again! when string is empty`() {
        val expected =alphabetWar("")
        assertEquals("Let's fight again!", expected)
    }
    @Test
    fun `Should give value 0 to values that are not left or right`() {
        val expected =alphabetWar("a")
        assertEquals("Let's fight again!", expected)
    }
}