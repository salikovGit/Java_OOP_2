import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Dog("Jack", 4),
                new Cat("Tom", 4), new Fish("Freddy", 0),
                new Duck("Villy", 2),
                new Shrimp("Bob", 26)));
    }

    public void talk(){
        for (Speakable item : getSpeakable()) {
            System.out.printf("%s \n",  item.speak());
        }
    }

    public List<Speakable> getSpeakable(){
        List<Speakable> speakables = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof Speakable){
                speakables.add((Speakable) animal);
            }
        }
        speakables.add(new Radio());
        return speakables;
    }

    public List<RunAble> getRunable(){
        List<RunAble> runables = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof RunAble){
                runables.add((RunAble) animal);
            }
        }
        return runables;
    }
    public List<FlyAble> getFlyable(){
        List<FlyAble> flyables = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof FlyAble){
                flyables.add((FlyAble) animal);
            }
        }
        return flyables;
    }

    public List<SwimAble> getSwimable(){
        List<SwimAble> swimAbles = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof SwimAble){
                swimAbles.add((SwimAble) animal);
            }
        }
        return swimAbles;
    }
    public void Move(){
        for (RunAble animal: getRunable()             ) {
            System.out.printf("%s %s\n", animal.toString(), animal.Run());
        }
    }

    public void Fly(){
        for (FlyAble animal: getFlyable()             ) {
            System.out.printf("%s %s\n", animal.toString(), animal.Fly());
        }
    }
    public void Swim(){
        for (SwimAble animal: getSwimable()             ) {
            System.out.printf("%s %s\n", animal.toString(), animal.swimmingSpeed());
        }
    }
}
