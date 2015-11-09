public class Earth {
    public static void main(String args[]) {
        Human tom;
        
        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 30;
        tom.name = "Tom Zsabo";
        tom.speak();
        
        Human joe = new Human();
        joe.age = 20;
        joe.eyeColor = "green";
        joe.heightInInches = 70;
        joe.name = "Average Joe";
        joe.speak();
    }
}
