import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        try {
            int result = a / ((b + c) / d);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }

//        if (d != 0 && b + c != 0) {
//            int result = a / ((b + c) / d);
//            System.out.println(result);
//        } else {
//            System.out.println("Division by zero!");
//        }
    }
}