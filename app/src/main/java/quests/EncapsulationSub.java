package quests;

import java.util.ArrayList;

public class EncapsulationSub {
    public int firstNum;
    public int secondNum;
    public ArrayList<String> result = new ArrayList<String>();

    public void setNumber(ArrayList<Integer> myNumbers){
        try{
            this.firstNum = myNumbers.get(0);
            this.secondNum = myNumbers.get(1);
        } catch (Exception e){
            System.out.println("다시 실행해주세요.");
        }
    }
    public ArrayList<String> getResult(){
        try{
            int resultNumber = this.firstNum / this.secondNum;
            this.result.add(Integer.toString(resultNumber));
        } catch (Exception e) {
            // Block of code to handle errors
            this.result.add("나눌 수 없습니다.");
        }
        try{
            int resultNumber = this.firstNum % this.secondNum;
            this.result.add(Integer.toString(resultNumber));                    
        } catch (Exception e) {
            // Block of code to handle errors
            this.result.add("나머지를 구할 수 없습니다.");
        }
        return this.result; 
    }
}
