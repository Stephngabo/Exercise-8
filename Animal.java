import java.util.Map;
//Stephane Irutingabo Runyutu 66415
public abstract class Animal implements AnimalBehaviour,AnimalMove,AnimalName {
    private String name;
    private int age;
    private double weight;

    public Animal() {
        this.name = "";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void eat();

    public abstract String getVoice();

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nWeight: " + this.weight;
    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
    @Override
    public void name() {

    }
}