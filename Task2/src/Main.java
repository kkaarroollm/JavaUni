import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempMaxLen = 0;
        int tempNumber = 0;
        int longNumber = 0;
        int longMaxLen = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0){
                break;

            }
            if (number != tempNumber){
                if (tempMaxLen > longMaxLen){
                    longMaxLen = tempMaxLen;
                    longNumber = tempNumber;
                }
                tempNumber = number;
                tempMaxLen = 1;
            } else {
                tempMaxLen += 1;
            }

        }
        if (tempMaxLen > longMaxLen) {
            longMaxLen = tempMaxLen;
            longNumber = tempNumber;
        }
        System.out.println("longest streak: " + longMaxLen + " of number: " + longNumber);
    }
}
