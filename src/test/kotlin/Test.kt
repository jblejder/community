import org.junit.Assert
import org.junit.Test
import java.util.*


class Test {

    @Test
    fun `fake constructor for Int`() {
        val r = Random()
        repeat(100) {
            val num = r.nextInt()
            Assert.assertEquals(num, kotlin.Int(num.toString()))
        }
    }


    /*
    Uncomment this if you feel brave enough to pass following tests too
     */

//    @Test
//    fun `fake constructor for Double`() {
//        val r = Random()
//        repeat(100) {
//            val num = r.nextDouble()
//            Assert.assertEquals(num, kotlin.Double(num.toString()))
//        }
//    }

//    @Test
//    fun `fake constructor for Long`() {
//        val r = Random()
//        repeat(100) {
//            val num = r.nextLong()
//            Assert.assertEquals(num, kotlin.Long(num.toString()))
//        }
//    }
}