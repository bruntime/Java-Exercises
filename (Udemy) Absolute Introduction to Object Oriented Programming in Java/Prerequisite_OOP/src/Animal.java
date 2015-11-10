public class Animal {
    String type;
    int age;
    String gender;
    int weightInPounds;
    String food;
    int sleepHours;

    public Animal(String type, int age, String gender, int weightInPounds, String food, int sleepHours) {
        this.type = type;
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
        this.food = food;
        this.sleepHours = sleepHours;
    }

    public void information() {
        System.out.println("Information:\n");
        System.out.println("Type: " + type);
        System.out.println("Age(yrs): " + age);
        System.out.println("Sex: " + gender);
        System.out.println("Weight(lbs): " + weightInPounds);
    }
    
    public void eat() {
        System.out.println("Consumes: " + food);                     
    }
    
    public void sleep() {
        System.out.println("Sleeps " + sleepHours + " hours daily");
    }
}
