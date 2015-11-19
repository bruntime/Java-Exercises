public class Chicken extends Bird{

    public Chicken(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }
    
    //overriding (replacing) the method defined in Bird
    public void fly() {
        System.out.println("not able to fly...");
    }
}
