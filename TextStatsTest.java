import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextStatsTest {

    @Test
    void testAddOneLine() {

        TextStats stats = new TextStats();


        stats.incrementLines(); // Lägg till en rad


        int expected = 1; // Förväntat antal rader
        int actual = stats.getTotalLines(); // Faktiskt antal rader
        assertEquals(expected, actual, "Antalet rader stämmer inte. Förväntat: " + expected + ", Faktiskt: " + actual);
    }

    @Test
    void testLongestWord() {

        TextStats stats = new TextStats();


        stats.addWords("Hej på dig");
        stats.addWords("välkommen till programmering");


        String expected = "programmering"; // Förväntat längsta ord
        String actual = stats.getLongestWord(); // Faktiskt längsta ord
        assertEquals(expected, actual, "Längsta ordet stämmer inte. Förväntat: " + expected + ", Faktiskt: " + actual);
    }

    @Test
    void testAddCharacters() {

        TextStats stats = new TextStats();


        stats.addChars(10); // Lägg till 10 tecken
        stats.addChars(5);  // Lägg till ytterligare 5 tecken


        int expected = 15; // Förväntat totalt antal tecken
        int actual = stats.getTotalChars(); // Faktiskt totalt antal tecken
        assertEquals(expected, actual, "Antalet tecken stämmer inte. Förväntat: " + expected + ", Faktiskt: " + actual);
    }

    @Test
    void testShouldStop() {

        TextStats stats = new TextStats();


        assertTrue(stats.shouldStop("stop"), "Programmet borde avslutas när användaren skriver 'stop'.");
        assertTrue(stats.shouldStop("STOP"), "Programmet borde avslutas oavsett versaler/gemener.");
        assertFalse(stats.shouldStop("fortsätt"), "Programmet borde inte avslutas för andra inmatningar.");
    }
}