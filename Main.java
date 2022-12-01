public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.talk();
        System.out.println("\nMoving");
        zoo.Move();
        System.out.println("\nFlying");
        zoo.Fly();
        System.out.println("\nSwimming");
        zoo.Swim();
    }
}