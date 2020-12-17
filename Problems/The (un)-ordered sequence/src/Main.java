import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int previousNumber = scanner.nextInt();
        int currentNumber;
        boolean ascendingFlag = true;
        boolean descendingFlag = true;
        
        while ((currentNumber = scanner.nextInt()) != 0) {
            
            if (previousNumber > currentNumber) {
                ascendingFlag = false;
            }
            if (previousNumber < currentNumber) {
                descendingFlag = false;
            }
            previousNumber = currentNumber;
        }
        
        System.out.println(ascendingFlag || descendingFlag);
    }
}
