import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of numbers: ");
        int listSize = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < listSize; i++) {
            sum = sum + scan.nextInt();
        }
        System.out.println(sum / listSize);
    }
}