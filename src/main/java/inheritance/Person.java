package inheritance;

public class Person {
    String name;

    public void work() {
        System.out.println("I'm working away...");
    }


    public Person(String personName) {
        this.name = personName;
    }

//    public Person() {
////        System.out.println("In person default constructor.");
//    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
