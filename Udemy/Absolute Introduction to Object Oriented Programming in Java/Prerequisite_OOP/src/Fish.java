public class Fish extends Animal{

     public Fish(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }
     
     public void swim() {
         System.out.println("Swimming...");
     }

     @Override
    public void move() {
       System.out.println("Fish is swimming...");
    }
}
