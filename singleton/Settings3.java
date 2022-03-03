package singleton;

public class Settings3 {
    private static Settings3 instance;

    private Settings3() {}

    public synchronized Settings3 getInstance() {
        if (instance == null) {
            instance = new Settings3();
        }
        return instance;
    }
}
