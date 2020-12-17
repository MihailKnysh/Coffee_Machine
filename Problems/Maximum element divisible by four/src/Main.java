import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 4 == 0) {
                max = arr[i];
                break;
            }
        }

        System.out.println(max);
    }
}
