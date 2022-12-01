public class Dog extends Animal implements Speakable, RunAble{

    public Dog(String name, int legsCount) {
        super(name, legsCount);
    }

    @Override
    public String speak() {
        return "Waw";
    }

    @Override
    public int Run() {
        return 15;
    }
}
