package isabel.android.juegodecartas22UK

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.random.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun arrayRandomSize() {
        val nextValues = MutableList(5) { Random.nextInt(0, 14) }
        assertEquals(5, nextValues.toIntArray().size)
    }

    @Test
    fun arrayRandom() {
        val nextValues = MutableList(5) { Random.nextInt(0, 14) }
        for(x in nextValues) {
            if(x in 0..13)
                assert(true)
            else
                assert(false)
        }
    }
}
