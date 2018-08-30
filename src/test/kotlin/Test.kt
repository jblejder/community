import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test
import java.io.File
import java.io.IOException
import java.util.*

class Test {

    @Test
    fun cannotUseFun() = try {
        val property = System.getProperty("user.dir")
        File("$property/src/main/kotlin/Exercise.kt").useLines {
            it.forEach {
                Assert.assertFalse("cannot use fun", "fun" in it)
                Assert.assertFalse("cannot use {", "{" in it)
                Assert.assertFalse("cannot use }", "}" in it)
            }
        }
    } catch (e: IOException) {
        fail("Failed to read the source file.")
    }

    @Test
    fun fixedTest() {
        assertEquals("onetwo", concatString("one", "two"))
    }

    @Test
    fun randomTest() {
        val r = Random()
        repeat(100) {
            val a = r.nextInt().toString(2)
            val b = r.nextInt().toString(2)
            assertEquals(a + b, concatString(a, b))
        }
    }
}