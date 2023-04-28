public abstract class Mammal extends Animal {
    public Mammal() {
        super();
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Mammal(String name) {
        super(name, 0, 0.0);
    }

    public abstract void wagTail();

    @Override
    public void eat() {
        System.out.println("I'm eating as a mammal");
    }

    @Override
    public String getVoice() {
        return "I'm making mammal sounds";
    }

    public abstract void run();
}
