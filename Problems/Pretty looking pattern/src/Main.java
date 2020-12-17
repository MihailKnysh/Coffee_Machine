import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] ch = new char[4][4];
        for (int i = 0; i < 4; i++) {
            ch[i] = scanner.next().toCharArray();
        }
        boolean pretty = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ch[i][j] == ch[i][j + 1] &&
                        ch[i][j] == ch[i + 1][j] &&
                        ch[i][j] == ch[i + 1][j + 1]) {
                    pretty = false;
                    break;
                }
            }
        }
        System.out.println(pretty ? "YES" : "NO");
    }
}