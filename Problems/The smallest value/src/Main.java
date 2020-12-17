import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long factorial = 1L;
        int step = 1;
        
        while (factorial <= number) {
            factorial *= ++step;
        }
        
        System.out.println(step);
    }
}
