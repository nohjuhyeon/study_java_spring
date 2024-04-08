package quests;

import java.util.Scanner;

public class AdditionsSubs {
        public int additionInt(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("첫번째 수 : ");
            int firstNumber = scanner.nextInt();
            System.out.print("두번째 수 : ");
            int SecondNumber = scanner.nextInt();
            int resultNumber = firstNumber + SecondNumber;
            scanner.close();
            return resultNumber;
        }
}
