package inheritance;

public class Main {
    public static void main(String[] args) {

        Person p = new Developer();

        // Works because the variable p is of type Person and Person objects def have work() method
        p.work();
        // But we can't call the consumeCaffeine() method, because a Person object doesn't have that method (only Developer objects do)
        // p.consumeCaffeine() 💥

        // So, we want to check what is really in p.. it could be a Sailor, Developer, or a Dentist object...
        if (p instanceof Developer ) {  // If it is an instance of Developer...
            Developer d = (Developer) p;    // Then we can cast it to a variable of type Developer safely
            d.consumeCaffeine();        // and we can call the consumeCaffeine() method on a variable of type Developer
        }
        else {
            System.out.println("Whatever it is, it ain't a developer.");
        }
    }
}
