import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstOperand = scanner.nextLong();
        String operator = scanner.next();
        long secondOperand = scanner.nextLong();

        switch (operator) {
            case "+": {
                System.out.println(firstOperand + secondOperand);
                break;
            }
            case "-": {
                System.out.println(firstOperand - secondOperand);
                break;
            }
            case "*": {
                System.out.println(firstOperand * secondOperand);
                break;
            }
            case "/": {
                if (secondOperand == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstOperand / secondOperand);
                }
                break;
            }
            default: {
                System.out.println("Unknown operator");
                break;
            }
        }
    }
}