package readability;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    private static final int[] ages = {0, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 24, 120};

    private static int age(double score) {
        return ages[(int) Math.round(score)];
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String text = new String(Files.readAllBytes(Path.of(args[0])));
        System.out.println("The text is:\n" + text + "\n");

        String[] words = text.split("\\s+");

        int counterWords = words.length;
        int sentences = text.split("[.!?]\\s+").length;
        int characters = text.replaceAll("[\\n\\t\\s]", "").length();
        int syllables = 0;
        int polySyllables = 0;
        int i;
        for (String word : words) {
            i = word.replaceAll("e$", "").replaceAll("$", "x").split("[aeiouy]+").length - 1;
            syllables += i == 0 ? 1 : i;
//            i = word.replaceAll("[!.?]", "").replaceAll("e$", "").replaceAll("$", "x").split("[aeiouy]+").length - 1;
            if (i > 2) {
                polySyllables++;
            }
        }
        System.out.printf("Words: %d\nSentences: %d\nCharacters: %d\nSyllables: %d\nPolysyllables: %d\n",
                counterWords, sentences, characters, syllables, polySyllables);
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all):");
        String input = scanner.next();
        scanner.close();
        System.out.println("");
        double ari = 4.71 * characters / counterWords + 0.5 * counterWords / sentences - 21.43;
        double fk = 0.39 * counterWords / sentences + 11.8 * syllables / counterWords - 15.59;
        double smog = 1.043 * Math.sqrt(polySyllables * 30.0 / sentences) + 3.1291;
        double cl = 0.0588 * 100 * characters / counterWords - 0.296 * 100 * sentences / counterWords - 15.8;
        if (input.equals("ARI") || input.equals("all"))
            System.out.printf("Automated Readability Index: %.2f (about %d year olds).\n", ari, age(ari));
        if (input.equals("FK") || input.equals("all"))
            System.out.printf("Flesch–Kincaid readability tests: %.2f (about %d year olds).\n", fk, age(fk));
        if (input.equals("SMOG") || input.equals("all"))
            System.out.printf("Simple Measure of Gobbledygook: %.2f (about %d year olds).\n", smog, age(smog));
        if (input.equals("CL") || input.equals("all"))
            System.out.printf("Coleman–Liau index: %.2f (about %d year olds).\n", cl, age(cl));
        double average = (age(ari) + age(fk) + age(smog) + age(cl)) / 4.0;
        System.out.printf("\nThis text should be understood in average by %.2f year olds.\n", average);

    }

}

