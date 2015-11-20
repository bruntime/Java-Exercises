public abstract class Animal {

    int age;
    String gender;
    int weightInPounds;

    public Animal(int age, String gender, int weightInPounds) {

        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }
    
      public void eat() {
        System.out.println("Consumes food");                     
    }
    
    public void sleep() {
        System.out.println("Sleeps long hours daily");
    }
    
    public abstract void move();
 }
