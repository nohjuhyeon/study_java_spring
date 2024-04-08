package quests;

import java.util.ArrayList;

public class ArithmeticsMain {
    public static void main(String[] args){
        ArrayList<String> myNumbers = new ArrayList<String>();
        ArithmeticsInputOut inputoutput = new ArithmeticsInputOut();
        ArrayList<Integer> inputnumbers = inputoutput.inputInt();
        int firstNumber = inputnumbers.get(0);
        int SecondNumber = inputnumbers.get(1);
        ArithmeticsSub subs = new ArithmeticsSub();
        String addNumber = subs.addInt(firstNumber,SecondNumber); 
        myNumbers.add(addNumber);       
        String minusNumber = subs.minusInt(firstNumber,SecondNumber); 
        myNumbers.add(minusNumber);       
        String multiplyNumber = subs.multiplyInt(firstNumber,SecondNumber); 
        myNumbers.add(multiplyNumber);       
        String devisionNumber = subs.divisionInt(firstNumber,SecondNumber); 
        myNumbers.add(devisionNumber);
        String remainNumber = subs.remainInt(firstNumber,SecondNumber); 
        myNumbers.add(remainNumber);
        inputoutput.outputInt(myNumbers);
    }
    }

