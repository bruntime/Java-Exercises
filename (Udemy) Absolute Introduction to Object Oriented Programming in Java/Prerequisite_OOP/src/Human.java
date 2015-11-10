/*
class: instructions for how objects should be created or behave (attributes and methods)
 */
public class Human {
    
    String name;
    int age;
    int heightInInches;
    String eyeColor;
    
    /* 
    constructor method - always has the same name as the class
    */
//    public Human(){
//        age = 5;
//        eyeColor = "brown";
//        heightInInches = 30;
//        name = "Tom Zsabo";
//    }

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }
   
    public void speak(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + heightInInches + " inches tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ".");
    }
    
    public void eat() {
        System.out.println("eating ...");
    }
    
    public void walk() {
        System.out.println("walking...");
    }
    
    public void work(){
        System.out.println("working...");
    }    
}
