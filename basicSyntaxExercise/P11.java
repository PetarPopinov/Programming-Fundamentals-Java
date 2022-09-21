package basicSyntaxExercise;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        //  vhodni danni

        int lostGames = Integer.parseInt(scanner.nextLine());
       double headSetPrice = Double.parseDouble(scanner.nextLine());
       double mousePrice = Double.parseDouble(scanner.nextLine());
       double keyboardPrice = Double.parseDouble(scanner.nextLine());
       double displayPrice = Double.parseDouble(scanner.nextLine());

       // kraina suma slushalki * headsetprice + monitori*displayprice + klaviaturi*boardprice+ mishki * mouseprice;

        int countHeadset = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeyboard = lostGames / 6;
        int countDisplay = lostGames / 12;

        double finalSum = (countHeadset * headSetPrice) + (mousePrice * countMouse) + (countKeyboard * keyboardPrice) + (displayPrice*countDisplay);

        System.out.printf("Rage expenses: %.2f lv.",finalSum);





    }
}
