import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isAscending = true;
        String[] sequence = scanner.nextLine().split(" ");

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i - 1].compareTo(sequence[i]) > 0) {
                isAscending = false;
                break;
            }
        }

        System.out.println(isAscending);
    }
}
