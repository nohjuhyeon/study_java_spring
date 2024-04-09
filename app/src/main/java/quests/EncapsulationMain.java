package quests;

import java.util.ArrayList;

public class EncapsulationMain {
    public static void main(String[] args){
        EncapsulationInputOut inputoutput = new EncapsulationInputOut();
        ArrayList<Integer> inputnumbers = inputoutput.inputInt();
        EncapsulationSub subs = new EncapsulationSub();
        subs.setNumber(inputnumbers);
        ArrayList<String> myNumbers = subs.getResult();
        inputoutput.outputInt(myNumbers);
    }
    }

