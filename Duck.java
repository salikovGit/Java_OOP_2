public class Duck extends Animal implements Speakable, FlyAble, RunAble, SwimAble{
    public Duck(String name, int legsCount) {
        super(name, legsCount);
    }

    @Override
    public String speak() {
        return "Crya";
    }

    @Override
    public String Fly() {
        return "Fly, little duck!";
    }

    @Override
    public int Run() {
        return 6;
    }

    @Override
    public String swimmingSpeed() {
        return "15 km/h";
    }
}
