package inheritance;

public class Person {
    String name;

    public Person(String personName) {
        this.name = personName;
    }

//    public Person() {
//        System.out.println("In person default constructor.");
//    }

    public String getName() {

        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
