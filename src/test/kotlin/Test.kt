import org.junit.Assert.assertEquals
import org.junit.Test


class Test {

    @Test
    fun strings() {
        assertEquals("I am the argument!", "I am the string invoke me!"("I am the argument!"))
        assertEquals("hello", "I am the string invoke me!"("hello"))
    }

    /*
    If you feel brave enough uncomment tests below
     */
//    @Test
//    fun ints() {
//        val r = Random()
//        repeat(100) {
//            r.nextInt().also { assertEquals(it, "another one"(it)) }
//        }
//    }
//
//    @Test
//    fun longs() {
//        val r = Random()
//        repeat(100) {
//            r.nextLong().also { assertEquals(it, "another one"(it)) }
//        }
//    }
}
