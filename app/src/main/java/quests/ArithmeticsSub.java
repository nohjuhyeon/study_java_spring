package quests;

public class ArithmeticsSub {
            public String addInt(int firstNumber, int SecondNumber){
                String resultNumber = "더할 수 없습니다.";
                try{
                    int result =  firstNumber + SecondNumber;
                    resultNumber = Integer.toString(result);
                } catch (Exception e) {
                    // Block of code to handle errors
                    System.out.println("더할 수 없습니다.");
                }
                return resultNumber;
            }
            public String minusInt(int firstNumber, int SecondNumber){
                String resultNumber = "뺄 수 없습니다.";
                try{
                    int result = firstNumber - SecondNumber;
                    resultNumber = Integer.toString(result);
                } catch (Exception e) {
                    // Block of code to handle errors
                    System.out.println("뺄 수 없습니다.");
                }
                return resultNumber;
            }
            public String multiplyInt(int firstNumber, int SecondNumber){
                String resultNumber = "곱할 수 없습니다.";
                try{
                    int result = firstNumber * SecondNumber;
                    resultNumber = Integer.toString(result);
                } catch (Exception e) {
                    // Block of code to handle errors
                }
                return resultNumber;
            }
            public String divisionInt(int firstNumber, int SecondNumber){
                String resultNumber = "나눌 수 없습니다.";
                try{
                    int result = firstNumber / SecondNumber;
                    resultNumber = Integer.toString(result);
                } catch (Exception e) {
                    // Block of code to handle errors
                    System.out.println("나눌 수 없습니다.");
                }
                return resultNumber;
            }
            public String remainInt(int firstNumber, int SecondNumber){
                String resultNumber = "나머지를 구할 수 없습니다.";
                try{
                    int result = firstNumber % SecondNumber;
                    resultNumber = Integer.toString(result);                    
                } catch (Exception e) {
                    // Block of code to handle errors
                }
                return resultNumber;
            }
}
