public abstract class Animal{
    protected String name;
    protected int legsCount;


    public Animal(String name, int legsCount) {
        this.name = name;
        this.legsCount = legsCount;
    }


    public String getName() {
        return name;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
