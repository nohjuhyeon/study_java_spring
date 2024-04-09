package co_templates;

public class EncapsulationAnimal {
    public int firstNum;
    public int secondNum;
    public int result;

    public void setResult(int number){
        this.result = number;
    }
    public int getResult(){
        return this.result; 
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
    public void byPass(int fisrtNumber, int secondNumber){
        this.firstNum = fisrtNumber;
        this.secondNum = secondNumber;
        this.result = fisrtNumber + secondNumber;
        return ;
    }
}
