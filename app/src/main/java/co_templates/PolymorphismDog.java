package co_templates;

public class PolymorphismDog extends PolymorphismAnimal{
    // public void animalSound() {
    //     System.out.println("The pig says : bow bow");
    // }
        public int speed(int kmeter){
            int result = (int) (kmeter * 100);
            return result;
        }
}
