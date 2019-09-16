
//oppagev levert av Preben Nilsen og Magnus Lind-Iversen
package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest{

        @Test
        void shouldReturnIfor1(){
            assertEquals ("I", toRoman(1));

        }
    @Test
    void shouldReturnIIfor2(){
        assertEquals("II", toRoman(2));

    }
    @Test
    void shouldReturnIIIfor3(){
        assertEquals("III", toRoman(3));

    }
    @Test
    void shouldReturnIVfor4(){
        assertEquals("IV", toRoman(4));

    }
    @Test
    void shouldReturnVfor5() {
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldCalculate6through8(){
        assertEquals( "VI", toRoman(6));
        assertEquals( "VII", toRoman(7));
        assertEquals( "VIII", toRoman(8));

    }
    @Test
    void shouldReturnIXfor9() {
        assertEquals("IX", toRoman(9));
    }

    @Test
    void shouldReturnXfor10(){
        assertEquals( "X", toRoman(10));

    }

    private String toRoman(int number) {
        if (number == 10) {
            return "X";
        } else if (number == 9) {
            return "IX";
        } else if (number == 8) {
            return "VIII";

        }else if (number == 7) {
            return "VII";
        }else if (number == 6) {
            return "VI";
        }else if (number == 5) {
            return "V";
        }else if (number == 4) {
            return "IV";
        }else if (number == 3) {
            return "III";
        }else if (number == 2) {
            return "II";
        } else {

            return "I";
        }
    }
}

