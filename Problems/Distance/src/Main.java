import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double distance = scanner.nextDouble();
        Double travelTime = scanner.nextDouble();
        System.out.println(distance / travelTime);
    }
}