public class Shrimp extends Animal implements SwimAble{
    public Shrimp(String name, int legsCount) {
        super(name, legsCount);
    }

    @Override
    public String swimmingSpeed() {
        return "3 km/h";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
