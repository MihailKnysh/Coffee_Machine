import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        scanner.nextInt();

        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}