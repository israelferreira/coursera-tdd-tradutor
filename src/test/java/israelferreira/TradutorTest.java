package israelferreira;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TradutorTest {

    @Test
    void tradutorSemPalavras() {
        Tradutor t = new Tradutor();
        assertTrue(t.estaVazio());
    }

    @Test
    void umaTraducao() {
        Tradutor t = new Tradutor();
        t.adicionaTraducao("bom", "good");
        assertFalse(t.estaVazio());
        assertEquals("good", t.traduzir("bom"));
    }
}
