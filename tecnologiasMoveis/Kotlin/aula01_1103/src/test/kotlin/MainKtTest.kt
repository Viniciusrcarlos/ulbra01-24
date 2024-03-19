import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun traduzir() {
        val str: String = org.example.traduzir("red")
        assertEquals("Vermelho", str)
        assertNotEquals("01010101", str)
    }
}