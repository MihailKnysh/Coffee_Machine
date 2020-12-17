import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int previousNumber = scanner.nextInt();
        int currentNumber;
        boolean isDescending = true;

        for (int i = 1; i < length; i++) {
            currentNumber = scanner.nextInt();
            if (currentNumber <= previousNumber) {
                isDescending = false;
            }
        }

        System.out.println(isDescending);
    }
}