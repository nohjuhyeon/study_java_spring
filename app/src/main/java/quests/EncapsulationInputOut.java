package quests;

import java.util.ArrayList;
import java.util.Scanner;

public class EncapsulationInputOut {
    public ArrayList<Integer> inputInt(){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("첫번째 수 : ");
            int firstNumber = scanner.nextInt();
            myNumbers.add(firstNumber);
            System.out.print("두번째 수 : ");
            int SecondNumber = scanner.nextInt();
            myNumbers.add(SecondNumber);
            scanner.close();
        } catch (Exception e) {
            // Block of code to handle errors
            System.out.println("숫자를 입력해주세요");
        }
        return myNumbers;
    }
    public void outputInt( ArrayList<String> myNumbers){
        System.out.println("나눗셈 : "+myNumbers.get(0));
        System.out.println("나머지 : "+myNumbers.get(1));
    }
}