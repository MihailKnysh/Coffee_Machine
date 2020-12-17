import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int value = 0;

        while (scanner.hasNext()) {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            sum += value;
        }

        System.out.println(sum);
    }
}
