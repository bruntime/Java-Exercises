public class Bird extends Animal {

    public Bird(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }
    
    public void fly() {
        System.out.println("Flying...");
    }
}
