import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Frasa: ");
        String word = scan.nextLine();

        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i)-'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bukan Huruf: " + word.charAt(i));
            }
        }

        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0)
                System.out.println((char)(i +'A') + ": " + counts[i]);
        }
    }
}
