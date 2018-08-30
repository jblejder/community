import org.junit.Assert.assertEquals
import org.junit.Test

class Test {

    private fun testGuardHelper(boolean: Boolean) {
        var int = 1
        guard(boolean) { int = 2 }
        assertEquals(if (boolean) 1 else 2, int)
    }


    private fun testUntilHelper(boolean: Int) {
        var int = 1
        var cond = boolean
        until({ (cond--) == 0 }) { int++ }
        assertEquals(boolean + 1, int)
    }

    @Test
    fun testUnless() {
        val r = java.util.Random()
        repeat(30) {
            testGuardHelper(r.nextBoolean())
        }
    }

    @Test
    fun testUntil() {
        val r = java.util.Random()
        repeat(30) {
            testUntilHelper(Math.abs(r.nextInt(10)))
        }
    }

    @Test
    fun testForceRun() {
        val r = java.util.Random()
        repeat(30) {
            forceRun { listOf(1)[r.nextInt()] }
        }
        var a = 1
        forceRun { a = 2 }
        assertEquals(a, 2)
    }
}