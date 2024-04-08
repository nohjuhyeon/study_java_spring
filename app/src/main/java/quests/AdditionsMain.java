package quests;


public class AdditionsMain {
    public static void main(String[] args){
        AdditionsSubs subs = new AdditionsSubs();
        int resultNumber = subs.additionInt();
        System.out.print("결과 : ");
        System.out.println(resultNumber);
    }
}
