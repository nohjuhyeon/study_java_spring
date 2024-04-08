package co_templates;

import java.util.ArrayList;

public class TryCatchsSubs {
    public void MethodsSubs() {
        System.out.println("MethodsSubs - MethodsSubs()");
    }

    // 접근자 리턴 메소드이름(파라메터){
    // return 0;
    // }
    public void methodsSubs() {
        System.out.println("MethodsSubs - methodsSubs()");
    }

    // with params
    public void methodsSubsWithParams(String fname, int count) {
        System.out.println("MethodsSubs - methodsSubsWithParams(String fname) ");
        System.out.println("parmas : fname-" + fname);
        return;
    }

    // with params
    public int methodsSubsWithParamsReturn(int firstNumber, int secondNumber) {
        int resultNumber = 0;
        try {
            // Block of code to try
            System.out.println("MethodsSubs - methodsSubsWithParamsReturn(int firstNumber, int secondNumber) ");
            System.out.println("parmas : firstNumber-" + firstNumber + ", secondNumber-" + secondNumber);
            resultNumber = firstNumber + secondNumber;
        } catch (Exception e) {
            // Block of code to handle errors
            System.out.println("methodsSubsWithParamsReturn(int firstNumber, int secondNumber) - catch (Exception e)");
        }
        return resultNumber;
    }

    public int returnException(int firstNumber){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);

        int result = 0;
        try {
            System.out.println(myNumbers.get(10));
            result = myNumbers.get(10);
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
            result = myNumbers.get(0);
        }
        return result ;
    }
}