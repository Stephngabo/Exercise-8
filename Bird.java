public abstract class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return this.featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public abstract void chirp();

    @Override
    public String toString() {
        return super.toString() + "\nFeather Color: " + this.featherColor;
    }
}