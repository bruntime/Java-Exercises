public class Dog extends Animal{

    public Dog(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds); /*super constructor */
    }
   
    public void Chase() {
        System.out.println("Chases....");
    }   
}
