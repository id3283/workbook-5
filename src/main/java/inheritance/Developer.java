package inheritance;

public class Developer extends Person {

    String primaryLanguage = "Java";

    public Developer() {
        super("Danielle");
        // sneak invisible parent default constructor being called here... 🤷🏼‍♂️
        System.out.println("In Developer ctor.");
    }
}
