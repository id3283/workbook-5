package animals;

public class Dog extends Animal {
    private String breed;

    public Dog() {
        super();
    }

    public Dog(String dogAnimalName, String breed) {
        super(dogAnimalName);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}