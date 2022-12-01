public class Cat extends Animal implements Speakable, RunAble{
    public Cat(String name, int legsCount) {
        super(name, legsCount);
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public int Run() {
        return 10;
    }
}
