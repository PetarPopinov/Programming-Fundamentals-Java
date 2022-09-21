import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", num, times, num * times);
            times++;
        }while (times <= 10);
    }
}
