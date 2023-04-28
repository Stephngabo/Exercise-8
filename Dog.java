public abstract class Dog extends Mammal {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    private String breed;

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println(this.getName() + " is wagging its tail.");
    }

    public void eat() {

    }
}