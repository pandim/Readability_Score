import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        String string;
        while (!(string = scanner.nextLine()).equals("0")) {
            strings.add(string);
        }
        for (String s : strings) {
            try {
                System.out.println(Integer.parseInt(s) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + s);
            }
        }
    }

}