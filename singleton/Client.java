package singleton;

public class Client {
    public static void main(String args[]) {
        // make instance
        Settings instance1 = Settings.getInstance();
        Settings instance2 = Settings.getInstance();
        System.out.println(instance1 == instance2);

    }
}
