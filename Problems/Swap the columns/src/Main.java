import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int firstCol = scanner.nextInt();
        int secondCol = scanner.nextInt();
        int temp;

        for (int i = 0; i < row; i++) {
            temp = arr[i][firstCol];
            arr[i][firstCol] = arr[i][secondCol];
            arr[i][secondCol] = temp;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}