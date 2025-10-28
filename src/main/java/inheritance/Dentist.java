package inheritance;

public class Dentist extends Person{


    @Override
    public String getName() {
        return "Dr. " + this.name;
    }

    @Override
    public void work() {
        System.out.println("I'm drilling away...");
    }


}
