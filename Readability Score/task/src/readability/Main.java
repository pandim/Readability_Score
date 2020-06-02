package readability;

//import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] age = {"","5-6","6-7","7-9","9-10","10-11","11-12","12-13","13-14","14-15","15-16","16-17","17-18",
                "18-24","24+"};
        Scanner scanner = new Scanner(System.in);
//        Scanner scannerFile = new Scanner(new FileReader(scanner.nextLine()));
        String text = scanner.nextLine();
        int words = text.split("[,;:\\s]+").length;
        int sentences = text.split("[.!?]+\\s*").length;
        int characters = text.replaceAll("[\\n\\t\\s]", "").length();
        Double score = 4.71 * characters / words + 0.5 * words / sentences - 21.43;
        System.out.println(words + " " + sentences + " " + characters + " " + score);

        System.out.printf("Words: %d\nSentences: %d\nCharacters: %d\nThe score is: %.2f\n" +
                        "This text should be understood by %s year olds.", words, sentences, characters, score,
                age[(int) Math.round(score)]);// должна быть точка, округляет нетуда floor
//        System.out.println((double) words/ sentences > 10 ?
//                "HARD" : "EASY");
    }

}
