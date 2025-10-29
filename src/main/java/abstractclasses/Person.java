package abstractclasses;

public abstract class Person {
    String name;

    public abstract void work();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
