public class TextStats {
    private int totalChars = 0; // Totalt antal tecken
    private int totalLines = 0; // Totalt antal rader
    private int totalWords = 0; // Totalt antal ord
    private String longestWord = ""; // Längsta ordet hittills

    // Kontrollera om användaren skrev "stop"
    public boolean shouldStop(String input) {
        return "stop".equalsIgnoreCase(input);
    }

    // Öka antalet rader
    public void incrementLines() {
        totalLines++;
    }

    // Lägg till antalet tecken från en rad
    public void addChars(int chars) {
        totalChars += chars;
    }

    // Räkna ord och hitta det längsta ordet
    public void addWords(String input) {
        String[] words = input.split(" "); // Dela upp texten i ord baserat på mellanslag
        totalWords += words.length; // Lägg till antalet ord i totalen

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Uppdatera längsta ordet
            }
        }
    }

    // Hämta totalt antal rader
    public int getTotalLines() {
        return totalLines;
    }

    // Hämta totalt antal tecken
    public int getTotalChars() {
        return totalChars;
    }

    // Hämta totalt antal ord
    public int getTotalWords() {
        return totalWords;
    }

    // Hämta det längsta ordet
    public String getLongestWord() {
        return longestWord;
    }
}