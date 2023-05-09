package tortoise
import org.testng.annotations.Test
import org.testng.internal.junit.ArrayAsserts.assertArrayEquals


class TortoiseTest {
    @Test
    fun `Test Speed of Tortoise A is slower than Tortoise B therefore they will catch` () {
        val expected =  intArrayOf(0, 32, 18)
        val result = race(720, 850, 70)
        assertArrayEquals(expected, result)
    }
    @Test
    fun `Test Speed of both Tortoises is same so they never catch up` () {
        val expected =  intArrayOf()
        val result = race(32, 32, 18)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `Test Tortoise A is faster than Tortoise B so they never catch up` () {
        val expected =  intArrayOf()
        val result = race(30, 21, 18)
        assertArrayEquals(expected, result)
    }

}
