package inheritance;

public class Developer extends Person {

    String primaryLanguage = "Java";

    public Developer() {
        super();
        // sneaky invisible parent default constructor being called here (first)...🤯
        // System.out.println("In Developer ctor.");
    }


    @Override
    public void work() {
        System.out.println("I'm coding away...");
    }

    public void consumeCaffeine() {
        System.out.println("Chug, chug, chug...");
    }
}
