import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int tripleCounter = 0;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 2; i < length; i++) {
            if (arr[i] - arr[i - 1] == 1 &&
                    arr[i - 1] - arr[i - 2] == 1) {
                tripleCounter++;
            }
        }

        System.out.println(tripleCounter);
    }
}

/*
    Scanner scanner = new Scanner(System.in);

    int length = scanner.nextInt();
    int previousNumber = scanner.nextInt();
    int currentNumber;
    int differenceCounter = 0;
    int tripleCounter = 0;

        for (int i = 1; i < length; i++) {
        currentNumber = scanner.nextInt();
        if (currentNumber - previousNumber == 1) {
        differenceCounter++;
        if (differenceCounter >= 3) {
        tripleCounter++;
        }
        } else {
        differenceCounter = 0;
        }
        previousNumber = currentNumber;
        }

        System.out.println(tripleCounter);
*/