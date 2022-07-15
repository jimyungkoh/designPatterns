package naiveSingleton;


public class App {

    public static void main(String[] args) {
        NaiveSingleton instance = NaiveSingleton.getInstance();

        NaiveSingleton newInstance = NaiveSingleton.getInstance();

        System.out.println("Do 'instance & newInstance' refer to the same object? "
                + (instance == newInstance));
    }
}
