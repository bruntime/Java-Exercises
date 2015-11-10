public class Zoo {
    public static void main(String args[]) {
        Animal cat = new Animal ("cat", 4, "female", 20, "meat", 18);
        Animal dog = new Animal ("dog", 1, "female", 8, "meat", 23);   
    
   cat.information();
   cat.eat();
   cat.sleep();
        System.out.println("\n");        
   dog.information();
   dog.eat();
   dog.sleep();
    }
}
