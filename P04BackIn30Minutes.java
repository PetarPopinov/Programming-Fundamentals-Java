import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int inithour = Integer.parseInt(scanner.nextLine());
         int initminutes = Integer.parseInt(scanner.nextLine());

         int allmiutes = (inithour*60) + initminutes + 30;
         int hour = allmiutes / 60;
         int minutes = allmiutes % 60;

         if (hour > 23){
             hour = 0;
         }
        System.out.printf("%d.%02d",hour,minutes);

    }
}

