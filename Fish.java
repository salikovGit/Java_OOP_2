public class Fish extends Animal implements SwimAble{

    public Fish(String name, int legsCount) {
        super(name, legsCount);
    }

    @Override
    public String swimmingSpeed() {
        return "25 km/h";
    }
}
