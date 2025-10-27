package animals;

public class Animal {
    private String name;

    public Animal() {
        System.out.println("Trace -- in Animal() class");
    }
    public Animal(String animalName) {
        System.out.println(
                "Trace -- in Animal(name) class w/ name");
        this.name = animalName;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}