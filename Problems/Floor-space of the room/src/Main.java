import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();

        switch (shape) {
            case "triangle": {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                double p = 0.5 * (a + b + c);
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            }
            case "rectangle": {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println((double) (a * b));
                break;
            }
            case "circle": {
                int r = scanner.nextInt();
                System.out.println(3.14 * r * r);
                break;
            }
            default: {
                System.out.println("Unsuitable action, please, try again");
                break;
            }
        }
    }
}