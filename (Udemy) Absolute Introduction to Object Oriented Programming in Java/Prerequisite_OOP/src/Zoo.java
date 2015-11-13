public class Zoo {
    public static void main(String args[]) {
        Animal bird = new Animal (4, "F", 36);
        Animal hippo = new Animal (1, "M", 9);
        
        bird.eat();
        hippo.sleep();
        
        Cat Tiny = new Cat(3, "M", 4);
        Tiny.eat();
        Tiny.sleep();
        
        Dog Shadow = new Dog(6, "F", 25);
        Shadow.sleep();      
    }
}
