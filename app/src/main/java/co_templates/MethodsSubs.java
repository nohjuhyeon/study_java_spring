package co_templates;
public class MethodsSubs {
    public void methodssubs(){
        System.out.println("MethodsSubs - MethodsSubs()");
    }
    // 접근자 리턴 메소드이름(파라메터){
    //      return 0;
    // }
    public void methodsSubs(){
        System.out.println("methodssubs - methodsSubs()");
    }
    // with params
    public void methodsSubsWithParams(String fname, int count){
        System.out.println("MethodsSubs - methodsSubsWithParams(string fname, int count)");
        System.out.println("params : fname-"+fname);
        return ;
    }
    public int methodsSubsWithParamsReturn(int firstNumber, int SecondNumber){
        System.out.println("MethodsSubs - methodsSubsWithParams(int firstNumber, int SecondNumber)");
        System.out.println("params : firstNumber-"+firstNumber+"params : SecondNumber-"+ SecondNumber);
        int resultNumber = firstNumber+SecondNumber;
        return resultNumber;
    }
}