import org.example.justify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MonospaceJustificationKtTest {
    @Test
    fun `text fits exactly into one row`() {
        //Given
        val content = """Moin, ich bin Paul und code heute mit Osman"""
        val width = 43
        //When
        val result = justify(content, width)
        //Then
        assertEquals("""Moin, ich bin Paul und code heute mit Osman""", result)
    }


    @Test
    fun `text fits into one row with extra space`() {
        //Given
        val content = """Moin, ich bin Paul und code heute mit Osman"""
        val width = 46
        //When
        val result = justify(content, width)
        //Then
        assertEquals("""Moin,  ich  bin  Paul und code heute mit Osman""", result)
    }

}