public  class Fish extends Animal {
    public Fish() {
        super();
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Fish(String name) {
        super(name, 0, 0.0);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating as a fish");
    }

    @Override
    public String getVoice() {
        return "I'm making fish sounds";
    }

    public void swim() {
        return;
    }

    public void blowBubbles() {
        return;
    }
}