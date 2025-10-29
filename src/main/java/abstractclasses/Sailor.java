package abstractclasses;

public class Sailor extends Person {
    String boatName;

    @Override
    public void work() {
        System.out.println("I'm sailing for work (dreaamm job!)");
    }

//    public void sail() {
//        System.out.println("🎵Sailing... it takes me away to where I'm goin'... 🎵");
//    }
}
