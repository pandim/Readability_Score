import java.util.Random;
import java.util.Scanner;

public class Main {
    static int previous = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        a = a + rnd(0, n - a - b - c);
        b = b + rnd(0, n - a - b - c);
        char[] arr = new char[n];
        for (int i = 0; i < arr.length; i++) {
            if (a > 0) {
                arr[i] = 'A';
                a--;
            } else if (b > 0) {
                arr[i] = 'a';
                b--;
            } else {
                arr[i] = '1';
            }
        }
        mix(arr);
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'A':
                    arr[i] = myRandom(65, 90);
                    break;
                case 'a':
                    arr[i] = myRandom(97, 122);
                    break;
                default:
                    arr[i] = myRandom(48, 57);

            }
        }
        System.out.println(String.copyValueOf(arr));
    }

    public static char myRandom(int a, int b) {
        int result;
        do {
            result = rnd(a, b);
        } while (result == previous);
        previous = result;
        return (char) result;
    }

    static int rnd(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);

    }

    static void mix(char[] arr) {
        Random rnd = new Random();
        for (int i = 1; i < arr.length; i++) {
            int j = rnd.nextInt(i);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
