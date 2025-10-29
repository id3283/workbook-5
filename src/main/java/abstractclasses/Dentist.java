package abstractclasses;

public class Dentist extends Person {


    @Override
    public void work() {
        System.out.println("I'm drilling away.");
    }

    @Override
    public String getName() {
        return "Dr. " + this.name;
    }


    public void causePain() {
        System.out.println("This is gonna hurt...");
    }

}
