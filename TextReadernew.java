import java.util.Scanner;

public class TextReadernew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextStats stats = new TextStats();

        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        while (true) {
            String input = scanner.nextLine();

            if (stats.shouldStop(input)) { // Flyttad kontroll till TextStats
                System.out.println("Programmet avslutas...");
                break;
            }

            stats.incrementLines(); // Öka antalet rader
            stats.addChars(input.length()); // Lägg till antalet tecken från raden
            stats.addWords(input); // Räkna ord och kontrollera längsta ordet

            System.out.println("Du skrev: " + input);
        }

        // Skriv ut statistiken
        System.out.println("Antal rader: " + stats.getTotalLines());
        System.out.println("Antal tecken: " + stats.getTotalChars());
        System.out.println("Antal ord: " + stats.getTotalWords());
        System.out.println("Längsta ordet: " + stats.getLongestWord());

        scanner.close();
    }
}