import org.example.justify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MonospaceJustificationKtTest{
    @Test
    fun `text fits exactly into one row`() {
        //Given
        val content = """Moin, ich bin Paul und code heute mit Osman"""
        val width = 43
        //When
        val result = justify(content,width)
        //Then
        assertEquals("""Moin, ich bin Paul und code heute mit Osman""",result)
    }


    @Test
    fun `text fits into one row with 1 extra gap added`() {
        //Given
        val content = """Moin, ich bin Paul und code heute mit Osman"""
        val width = 46
        //When
        val result = justify(content,width)
        //Then
        assertEquals("""Moin,  ich  bin  Paul und code heute mit Osman""",result)
    }

    @Test
    fun `text fits into one row with multiple different extra gaps added `() {
        //Given
        val content = """Moin, ich bin Paul und code heute mit Osman"""
        val width = 53
        //When
        val result = justify(content,width)
        //Then
        assertEquals("""Moin,   ich   bin  Paul  und  code  heute  mit  Osman""",result)
    }
}