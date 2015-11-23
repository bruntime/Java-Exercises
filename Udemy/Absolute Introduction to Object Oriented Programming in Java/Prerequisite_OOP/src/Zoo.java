public class Zoo {
    public static void main(String args[]) {
        Sparrow sparrow1 = new Sparrow(4, "F", 6);
        //sparrow1.move();
        
        Animal fish1 = new Fish(1, "M", 2);
        //fish1.move();
        
        Flyable flyingbird = new Sparrow(2, "F", 4);
        flyingbird.fly();

        moveAnimal(fish1);
        moveAnimal(sparrow1);
    }
    
    //polymorphism
    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
