package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println((double) text.split("[,;:\\s]+").length/text.split("[.!?]+\\s*").length > 10 ?
                "HARD" : "EASY");
    }

}
